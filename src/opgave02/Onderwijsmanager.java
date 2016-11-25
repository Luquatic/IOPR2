package opgave02;

import java.util.ArrayList;

public class Onderwijsmanager extends Persoon {

	ArrayList<Docent> docenten = new ArrayList<Docent>();
	private Secretaresse secretaresse;
	private Opleiding opleiding;

	public Onderwijsmanager (String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
		this.secretaresse = secretaresse;
		this.opleiding = opleiding;
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " werkt als onderwijsmanager. ");
	}

}
