package opgave02;

import java.util.ArrayList;

public class Docent extends Persoon {

	ArrayList<Student> studenten = new ArrayList<Student>();
	private Opleiding opleiding;

	public Docent(String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
		this.opleiding = opleiding;
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " werkt als docent. ");
	}

}
