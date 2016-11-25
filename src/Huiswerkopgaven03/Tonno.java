package Huiswerkopgaven03;

public class Tonno extends Pizza implements Deliverable {

	public Tonno() {
		this.naam = "Tonno";
		this.prijs = 10.50;
	}

	public Tonno(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}
}
