package it.polito.tdp.crimes.model;

import com.javadocmd.simplelatlng.LatLng;

public class Distretto implements Comparable<Distretto> {
	int id;
	double latitudine;
	double longitudine;
	LatLng coordinate;

	public Distretto(int id, double latitudine, double longitudine) {
		super();
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.coordinate = new LatLng(latitudine, longitudine);

	}

	public LatLng getCoordinate() {
		return coordinate;
	}

	public int getId() {
		return id;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public double getLongitudine() {
		return longitudine;
	}

	@Override
	public String toString() {
		return "Distretto [id=" + id + ", latitudine=" + latitudine + ", longitudine=" + longitudine + "]";
	}

	@Override
	public int compareTo(Distretto o) {
		return this.id-o.getId();
	}

}
