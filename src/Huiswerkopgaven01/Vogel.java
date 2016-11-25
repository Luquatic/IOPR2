package Huiswerkopgaven01;

import javafx.scene.paint.Color;

public class Vogel extends Dier {

	protected Color kleurVeren;
	protected int lengteSnavel;

	public Vogel(String naam, int aantalPoten, int lengtePoten, boolean staart, Color kleurVeren, int lengteSnavel) {
		super(naam, aantalPoten, lengtePoten, staart);
		this.kleurVeren = kleurVeren;
		this.lengteSnavel = lengteSnavel;
	}

	public void setKleurVeren(Color kleurVeren) {
		this.kleurVeren = kleurVeren;
	}
	public Color getKleurVeren() {
		return this.kleurVeren;
	}

	public void setLengteSnavel(int lengteSnavel) {
		this.lengteSnavel = lengteSnavel;
	}
	public int getLengteSnavel() {
		return this.lengteSnavel;
	}

}
