package opgave16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TekstWegschrijfProgramma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Naam bestanden: ");
		String bestand = input.nextLine();
		String naamTB = bestand + ".txt";
		//String naamBB = bestand + ".dat";
		File tekstBestand = new File(naamTB);


		String invoer;
		do {
			System.out.println("");
			invoer = input.nextLine() + "\n";
		}
		while (!(invoer.equals("STOP")));

		try {
			FileWriter fwTB = new FileWriter(tekstBestand);
			fwTB.write(invoer);
			fwTB.close();
		} catch (IOException e) {
			System.out.println("IOException: Nothing happens.");
		}
	}
}