package Huiswerkopgaven03;

public class QuattroStagionni extends Pizza implements Deliverable {

	public QuattroStagionni() {
		this.naam = "Quattro Stagionni";
		this.prijs = 8.75;
	}

	public QuattroStagionni(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}
}
