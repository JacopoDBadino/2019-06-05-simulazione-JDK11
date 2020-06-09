package it.polito.tdp.crimes.model;

import java.time.LocalDateTime;

public class Crimine {

	int distretto;
	LocalDateTime data;
	String tipoCrimine;

	public Crimine(int distretto, LocalDateTime data, String tipoCrimine) {
		super();
		this.distretto = distretto;
		this.data = data;
		this.tipoCrimine = tipoCrimine;
	}

	public int getDistretto() {
		return distretto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getTipoCrimine() {
		return tipoCrimine;
	}

}
