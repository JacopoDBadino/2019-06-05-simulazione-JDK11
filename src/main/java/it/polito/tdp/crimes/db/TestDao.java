package it.polito.tdp.crimes.db;

import it.polito.tdp.crimes.model.Distretto;

public class TestDao {

	public static void main(String[] args) {
		EventsDao dao = new EventsDao();
		System.out.println(dao.getWorstDistrictsIds(2017).get(0));
	}

}
