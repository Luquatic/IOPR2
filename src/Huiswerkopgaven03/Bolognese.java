package Huiswerkopgaven03;

public class Bolognese extends Pizza implements Deliverable {

	public Bolognese() {
		this.naam = "Bolognese";
		this.prijs = 7.00;
	}

	public Bolognese(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}

}
