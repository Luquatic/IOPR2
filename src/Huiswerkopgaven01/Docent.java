package Huiswerkopgaven01;

import java.util.ArrayList;

public class Docent extends Werknemer {

	private ArrayList<Student> studenten = new ArrayList<Student>();
	private Opleiding opleiding;

	public Docent(String naam, int leeftijd, double lengte, int gewicht, Opleiding opleiding) {
		super(naam, leeftijd, lengte, gewicht);
		this.opleiding = opleiding;
	}

}
