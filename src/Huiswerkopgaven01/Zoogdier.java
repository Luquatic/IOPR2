package Huiswerkopgaven01;

import javafx.scene.paint.Color;

public class Zoogdier extends Dier {

	protected Color kleurVacht;

	public Zoogdier(String naam, int aantalPoten, int lengtePoten, boolean staart, Color kleurVacht) {
		super(naam, aantalPoten, lengtePoten, staart);
		this.kleurVacht = kleurVacht;
	}

	public void setKleurVacht(Color kleurVacht) {
		this.kleurVacht = kleurVacht;
	}
	public Color getKleurVacht() {
		return this.kleurVacht;
	}

}
