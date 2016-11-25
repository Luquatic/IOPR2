package opgave02;

public abstract class Persoon {

	protected String naam;
	protected int leeftijd;
	protected double lengte;
	protected int gewicht;

	public Persoon() {

	}

	public Persoon(String naam, int leeftijd, double lengte, int gewicht) {

	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return this.naam;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

	public int getLeeftijd() {
		return this.leeftijd;
	}

	public void setLengte(double lengte) {
		this.lengte = lengte;
	}

	public double getLengte() {
		return this.lengte;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getGewicht() {
		return this.gewicht;
	}
	
	public abstract void werkt();
}
