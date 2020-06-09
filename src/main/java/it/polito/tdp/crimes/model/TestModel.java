package it.polito.tdp.crimes.model;

public class TestModel {

	public static void main(String[] args) {
		Model model = new Model();
		model.creaGrafo(2017);
		System.out.println(model.getGrafo().vertexSet().size());
		System.out.println(model.getGrafo().edgeSet().size());
	}

}
