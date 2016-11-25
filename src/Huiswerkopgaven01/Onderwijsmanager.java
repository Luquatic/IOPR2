package Huiswerkopgaven01;

import java.util.ArrayList;

public class Onderwijsmanager extends Werkgever {

	private ArrayList<Docent> docenten = new ArrayList<Docent>();
	private Secretaresse [] secretaresses = new Secretaresse[1];

	public Onderwijsmanager(String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

}
