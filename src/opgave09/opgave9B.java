package opgave09;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class opgave9B {

	public static void main(String[] args) {

		try{
			// Hieronder zijn een paar een docenten in een array gezet.
		String [] arrDocenten = new String[3];
		arrDocenten[1] = "Koen";
		arrDocenten[2] = "Rob";
		arrDocenten[3] = "Martijn";
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayOutOfBoundsException: " + e.getMessage());
		}

		try{
			// De vorige Onderwijsmanager van Informatica was Patrick Pijnenburg.
		String onderwijsmanager = "Patrick Pijnenburg";
		// Hij is nu weg.
		onderwijsmanager = null;
		// Op welke indexpositie staat een spatie in zijn naam?
		int indexPositie = onderwijsmanager.indexOf(" ");
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException: " + e.getMessage());
		}

		try{
			// De leeftijd van Martijn als String
		String leeftijdMartijn = "34 jaar";
		// Hiervan moet een integer gemaakt worden.
		int leeftijdVanMartijn = Integer.parseInt(leeftijdMartijn);
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException" + e.getMessage());
		}

		try {
			DataInputStream invoer = new DataInputStream(new FileInputStream("bestand.dat"));
			while (true) {
				System.out.println(invoer.readDouble());
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (EOFException e) {
			System.out.println("EOFException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}


	}

}
