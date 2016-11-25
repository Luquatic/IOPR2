package Huiswerkopgaven01p2;

import java.util.ArrayList;

public class Onderwijsmanager extends Werkgever {

	ArrayList<Docent> Docenten = new ArrayList<Docent>();
	private Secretaresse [] Secretaresses = new Secretaresse[1];

	public Onderwijsmanager(String naam, int leeftijd, double gewicht) {
		super(naam, leeftijd, gewicht);
		// TODO Auto-generated constructor stub
	}

}
