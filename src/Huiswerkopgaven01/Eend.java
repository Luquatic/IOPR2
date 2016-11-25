package Huiswerkopgaven01;

import javafx.scene.paint.Color;

public class Eend extends Vogel {

	public Eend(String naam, int aantalPoten, int lengtePoten, boolean staart, Color kleurVeren, int lengteSnavel) {
		super(naam, aantalPoten, lengtePoten, staart, kleurVeren, lengteSnavel);
	}

	public void praat() {
		System.out.println("Kwak");
	}

	public String toString() {
		String zin = "Eend " +naam +" heeft " +aantalPoten +" aantal poten van " +lengtePoten +"cm en een snavel van " +lengteSnavel +"cm. En heeft ";

		if (staart == true) {
			zin = zin + "een staart.";
		} else {
			zin = zin + "geen staart.";
		}

		return zin;
	}

}
