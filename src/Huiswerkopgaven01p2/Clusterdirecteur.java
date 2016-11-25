package Huiswerkopgaven01p2;

public class Clusterdirecteur extends Werkgever {

	private Onderwijsmanager [] Onderwijsmanagers = new Onderwijsmanager[4];
	private Secretaresse [] Secretaresses = new Secretaresse[2];

	public Clusterdirecteur(String naam, int leeftijd, double gewicht) {
		super(naam, leeftijd, gewicht);
	}

}
