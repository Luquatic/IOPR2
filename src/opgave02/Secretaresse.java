package opgave02;

public class Secretaresse extends Persoon {

	public Secretaresse (String naam, int leeftijd, double lengte, int gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " werkt als secretaresse. ");
	}
}
