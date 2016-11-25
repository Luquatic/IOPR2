package opgave15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Huiswerkopgaven01.Gebouw;

public class Writer2 {

	Scanner input = new Scanner(System.in);

	public void writeText() {
		System.out.println("Naam bestand: ");
		String naamBestand = input.nextLine();
		input.close();

		File nieuwBestand = new File(naamBestand);

		if(!nieuwBestand.exists()) {
			try {
				nieuwBestand.createNewFile();
				System.out.println(nieuwBestand +" is aangemaakt in: " +nieuwBestand.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("Nothing happened.");
			}
		}	else {
				System.out.println("Het bestand " + nieuwBestand + " bestaat al.");
			}

		try {
			FileWriter writer = new FileWriter(nieuwBestand);
			for(Gebouw i : gebouwLijst) {
			writer.write(i.printStatus());
		}
		writer.close();
		} catch (IOException e) {
			System.out.println("Nothing happened.");
		}
	}
}

