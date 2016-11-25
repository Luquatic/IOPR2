package Huiswerkopgaven03;

public class BigPizza extends Pizza {

	public BigPizza() {
		this.naam = "Big Pizza";
		this.prijs = 16.50;
	}

	public BigPizza(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}

}
