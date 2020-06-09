package it.polito.tdp.crimes.model;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class Simulatore {

	// PARAMETRI DI SIMULAZIONE
	Model model;
	Integer nAgenti;
	LocalDate giorno;
	Distretto partenza;

	// OUTPUT DA CALCOLARE

	// STATO DEL SISTEMA
	Integer malGestiti;

	// CODA DEGLI EVENTI
	PriorityQueue<SimEvent> queue;

	// INIZIALIZZAZIONE

	public void init(int nAgenti, LocalDate date) {
		model = new Model();
		this.nAgenti = nAgenti;
		giorno = date;
		partenza = model.getWorst(giorno.getYear());

	}

	// ESECUZIONE
	public void run() {
		while (!this.queue.isEmpty()) {
			SimEvent e = this.queue.poll();
			processEvent(e);
		}
	}

	// PROCESS

	private void processEvent(SimEvent e) {
		// TODO Auto-generated method stub

	}

}
