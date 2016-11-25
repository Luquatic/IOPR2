package Huiswerkopgaven01;

import javafx.scene.paint.Color;

public class Kat extends Zoogdier{

	public Kat(String naam, int aantalPoten, int lengtePoten, boolean staart, Color kleurVacht) {
		super(naam, aantalPoten, lengtePoten, staart, kleurVacht);
	}

	public void praat() {
		System.out.println("Miauw");
	}

}
