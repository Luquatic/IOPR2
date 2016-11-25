package opgave03;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Main {

	public static void main(String[] args) {

		Eend eend = new Eend("Kwik", 2, 20, true, Color.GREEN, 50);
		Hond hond = new Hond("Pluto", 4, 49, true, Color.ORANGE);
		Kat kat = new Kat("Marie", 4, 25, true, Color.WHITE);

		ArrayList<Dier> dieren = new ArrayList<Dier>();
		dieren.add(eend);
		dieren.add(hond);
		dieren.add(kat);

		for (int i = 0; i < dieren.size(); i++) {
			Dier dier = dieren.get(i);
			System.out.print(dier.getNaam() +" zegt: ");
			dier.praat();
			System.out.println(dier);
		}

	}

}
