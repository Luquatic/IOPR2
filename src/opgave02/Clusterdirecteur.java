package opgave02;

public class Clusterdirecteur extends Persoon {

	Onderwijsmanager[] onderwijsmanagers = new Onderwijsmanager[4];
	Secretaresse[] secretaresses = new Secretaresse[2];

	public Clusterdirecteur (String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " werkt als clusterdirecteur. ");
	}

}
