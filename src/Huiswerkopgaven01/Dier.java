package Huiswerkopgaven01;

public class Dier {

	protected String naam;
	protected int aantalPoten;
	protected int lengtePoten;
	protected boolean staart;

	public Dier (String naam, int aantalPoten, int lengtePoten, boolean staart) {
		this.naam = naam;
		this.aantalPoten = aantalPoten;
		this.lengtePoten = lengtePoten;
		this.staart = staart;
	}

	public void praat() {
		System.out.println("Zegt wat...");
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getNaam() {
		return this.naam;
	}

	public void setAantalPoten(int aantalPoten) {
		this.aantalPoten = aantalPoten;
	}
	public int getAantalPoten() {
		return this.aantalPoten;
	}

	public void setLengtePoten(int lengtePoten) {
		this.lengtePoten = lengtePoten;
	}
	public int getLengtePoten() {
		return this.lengtePoten;
	}

	public void setStaart(boolean staart) {
		this.staart = staart;
	}
	public boolean getStaart() {
		return this.staart;
	}

}
