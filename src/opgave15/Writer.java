package opgave15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

	Scanner input = new Scanner(System.in);

	public void writeText() {
		System.out.print("Naam bestand: ");
		String naamBestand = input.nextLine();
		input.close();

		File nieuwBestand = new File(naamBestand);

		if(!nieuwBestand.exists()) {
				try {
					nieuwBestand.createNewFile();
					System.out.println("Nieuw bestand aangemaakt in: " + nieuwBestand.getAbsolutePath());
				} catch (IOException e) {
					System.out.println("IOException: Nothing happens.");
				}
		} else {
			System.out.println("Het bestand " + nieuwBestand + " bestaat al.");
		}
	}
	
	try {
	int result = number / 0;}

}
