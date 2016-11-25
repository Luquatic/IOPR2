package Huiswerkopgaven01p2;

public class Persoon {

	protected String naam;
	protected int leeftijd;
	protected double gewicht;

	public Persoon(String naam, int leeftijd, double gewicht) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}



}
