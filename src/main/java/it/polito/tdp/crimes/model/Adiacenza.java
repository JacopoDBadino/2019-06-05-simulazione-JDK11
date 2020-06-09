package it.polito.tdp.crimes.model;

public class Adiacenza implements Comparable<Adiacenza> {
	Distretto d1;
	Distretto d2;
	double peso;

	public Adiacenza(Distretto d1, Distretto d2, double peso) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.peso = peso;
	}

	public Distretto getD1() {
		return d1;
	}

	public Distretto getD2() {
		return d2;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public int compareTo(Adiacenza o) {
		// TODO Auto-generated method stub
		return -(int) (peso-o.getPeso());
	}

}
