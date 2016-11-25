package opgave20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Aantal woorden door elkaar heen: ");
	int aantalWoorden = input.nextInt();

	ArrayList<TekstToner> alWoordToners = new ArrayList<TekstToner>();

	for (int i = 0; i<aantalWoorden; i++){
		System.out.print("Wat is het woord " + (i+1) + ": ");
		String nieuwWoord = input.next();
		System.out.print("Hoevaak moet het woord " + nieuwWoord + " worden getoond? ");
		int aantalKeer = input.nextInt();
		alWoordToners.add(new TekstToner(nieuwWoord, aantalKeer));
		}

		input.close();

		for (int j; j<alWoordToners.size(); j++){
			alWoordToners.get(j).start();
		}
	}

public void run() {
	// TODO Auto-generated method stub
	
}

}
