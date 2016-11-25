package Huiswerkopgaven03;

public abstract class Pizza {

	protected String naam;
	protected double prijs;
	protected String bezorgadres;

	public Pizza () {}

	public Pizza(String naam, double prijs) {
		this.naam = naam;
		this.prijs = prijs;
	}

	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getPrijs() {
		return prijs;
	}
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public String getBezorgadres() {
		return bezorgadres;
	}
	public void setBezorgadres(String bezorgadres) {
		this.bezorgadres = bezorgadres;
	}

	public String toString() {
		return this.naam + " kost " + this.prijs;
	}




}
