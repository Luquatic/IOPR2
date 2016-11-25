package Huiswerkopgaven01;

import java.util.ArrayList;

public class Winkel {

	private ArrayList<String> assortiment;

	public Winkel() {
		this.assortiment = new ArrayList<String>();
	}

	public void voegToeAanAssortiment(String product) {
		this.assortiment.add(product);
	}

	public void printAssortiment() {
		for (String p : assortiment) {
			System.out.println(p);
		}
	}

}
