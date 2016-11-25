package Huiswerkopgaven01;

import javafx.scene.paint.Color;

public class MainDier {

	public static void main(String[] args) {

		Eend[] arrEenden = new Eend[3];
		arrEenden[0] = new Eend("Kwik", 2, 20, true, Color.GREEN, 50);
		arrEenden[1] = new Eend("Kwek", 2, 21, true, Color.BLUE, 49);
		arrEenden[2] = new Eend("Kwak", 2, 19, true, Color.RED, 51);

		Hond[] arrHonden = new Hond[2];
		arrHonden[0] = new Hond("Pluto", 4, 49, true, Color.ORANGE);
		arrHonden[1] = new Hond("Brutus", 4, 51, true, Color.WHITE);

		Kat[] arrKatten = new Kat[4];
		arrKatten[0] = new Kat("Marie", 4, 25, true, Color.WHITE);
		arrKatten[1] = new Kat("Marie", 4, 27, true, Color.BLACK);
		arrKatten[2] = new Kat("Marie", 4, 23, true, Color.BLACK);
		arrKatten[3] = new Kat("Marie", 4, 24, true, Color.YELLOW);

		arrEenden[0].praat();
		arrHonden[0].praat();
		arrKatten[0].praat();

		for (int i = 0; i < arrEenden.length; i++) {
			System.out.println(arrEenden[i]);
		}
	}

}
