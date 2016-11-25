package opgave01;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Run {

	public static void main(String[] args) {


		Figuur d1 = new Driehoek();
		System.out.println(d1.getAchtergrondkleur());

		ArrayList<Figuur> figuurLijst = new ArrayList<Figuur>();
		figuurLijst.add(new Driehoek(3, 3, 3, Color.WHITE, Color.BLACK));
		figuurLijst.add(new Vierkant(5, Color.WHITE, Color.BLACK));
		figuurLijst.add(new Vierhoek(2, 4, Color.WHITE, Color.BLACK));

		for (int i = 0; i < figuurLijst.size(); i++) {
			System.out.println(figuurLijst.get(i));
		}


	}

}
