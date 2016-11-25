package opgave03;

import javafx.scene.paint.Color;

public class Eend extends Dier {

	private Color veren;
	private double lengteSnavel;

	public Eend(String naam, int aantalPoten, double lengtePoten, boolean staart, Color veren, double lengteSnavel) {
		super(naam, aantalPoten, lengtePoten, staart);
		this.veren = veren;
		this.lengteSnavel = lengteSnavel;
	}

	@Override
	public void praat() {
		System.out.println("Kwak");
	}

	@Override
	public String toString() {
		String zin = "De eend " + naam + " heeft " + aantalPoten + " poten, die elk " + lengtePoten +
					" cm lang zijn, heeft een snavel van " + lengteSnavel + " cm." + " En heeft";

		if (staart == true) {
			zin = zin + " een staart.";
		} else {
			zin = zin + " geen staart.";
		}
		return zin;
	}
}
