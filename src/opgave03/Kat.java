package opgave03;

import javafx.scene.paint.Color;

public class Kat extends Dier{

	private Color vacht;

	public Kat(String naam, int aantalPoten, double lengtePoten, boolean staart, Color vacht) {
		super(naam, aantalPoten, lengtePoten, staart);
		this.vacht = vacht;
	}

	@Override
	public void praat() {
		System.out.println("Miauw");
	}

}
