package it.polito.tdp.crimes.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LengthUnit;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {

	EventsDao dao;
	SimpleWeightedGraph<Distretto, DefaultWeightedEdge> grafo;

	public Model() {
		dao = new EventsDao();
	}

	public List<Integer> getYears() {
		return dao.getYears();
	}

	public void creaGrafo(int anno) {
		grafo = new SimpleWeightedGraph<Distretto, DefaultWeightedEdge>(DefaultWeightedEdge.class);

		Graphs.addAllVertices(grafo, dao.getDistricts(anno));

		for (Distretto d1 : grafo.vertexSet())
			for (Distretto d2 : grafo.vertexSet())
				if (d1.getId() > d2.getId())
					Graphs.addEdge(grafo, d1, d2,
							LatLngTool.distance(d1.getCoordinate(), d2.getCoordinate(), LengthUnit.KILOMETER));

	}

	public SimpleWeightedGraph<Distretto, DefaultWeightedEdge> getGrafo() {
		return grafo;
	}

	public List<Adiacenza> getNeighbours(Distretto d) {
		List<Adiacenza> res = new ArrayList<Adiacenza>();

		for (Distretto att : Graphs.neighborListOf(grafo, d)) {
			Adiacenza a = new Adiacenza(d, att, this.grafo.getEdgeWeight(this.grafo.getEdge(d, att)));
			res.add(a);
		}

		Collections.sort(res);
		return res;

	}

	public Distretto getWorst(int anno) {
		List<Integer> data = dao.getWorstDistrictsIds(anno);
		for (Distretto d : this.grafo.vertexSet())
			if (d.getId() == data.get(0))
				return d;

		return null;
	}

}
