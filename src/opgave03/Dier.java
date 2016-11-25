package opgave03;

public abstract class Dier {

	protected String naam;
	protected int aantalPoten;
	protected double lengtePoten;
	protected boolean staart;

	public Dier(String naam, int aantalPoten, double lengtePoten, boolean staart) {
		this.naam = naam;
		this.aantalPoten = aantalPoten;
		this.lengtePoten = lengtePoten;
		this.staart = staart;
	}

	public abstract void praat();

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

	public void setLengtePoten(double lengtePoten) {
		this.lengtePoten = lengtePoten;
	}

	public double getLengtePoten() {
		return this.lengtePoten;
	}

	public void setStaart(boolean staart) {
		this.staart = staart;
	}

	public boolean getStaart() {
		return this.staart;
	}

}
