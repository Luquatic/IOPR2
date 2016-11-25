package Huiswerkopgaven03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pizza> alPizzas = new ArrayList<Pizza>();
		alPizzas.add(new Bolognese());
		alPizzas.add(new QuattroStagionni());
		alPizzas.add(new Tonno());
		alPizzas.add(new Calzone());
		alPizzas.add(new Hawaii());
		alPizzas.add(new BigPizza());

		for (int i = 0; i < alPizzas.size(); i++) {
			System.out.println(alPizzas.get(i));
		}
	}

}
