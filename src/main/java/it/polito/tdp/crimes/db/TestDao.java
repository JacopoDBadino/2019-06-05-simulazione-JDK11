package it.polito.tdp.crimes.db;

import it.polito.tdp.crimes.model.Distretto;

public class TestDao {

	public static void main(String[] args) {
		EventsDao dao = new EventsDao();
		for(Distretto e : dao.getDistricts(2017))
			System.out.println(e);
	}

}
