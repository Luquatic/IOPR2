package Huiswerkopgaven03;

public class Calzone extends Pizza implements Deliverable{

	public Calzone() {
		this.naam = "Calzone";
		this.prijs = 6.50;
	}

	public Calzone(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}
}
