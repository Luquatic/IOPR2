package Huiswerkopgaven03;

public class Hawaii extends Pizza implements Deliverable {

	public Hawaii() {
		this.naam = "Hawaii";
		this.prijs = 12.75;
	}

	public Hawaii(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}
}
