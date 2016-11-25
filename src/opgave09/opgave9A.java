package opgave09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class opgave9A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try{
			System.out.print("Voer eerste getal in: ");
			int a = input.nextInt();

			System.out.print("Voer tweede getal in: ");
			int b = input.nextInt();

			System.out.println(a + " gedeeld door " + b + " = " + (a / b));
		}
		catch(InputMismatchException e){
			System.out.println("Er is iets fout gegaan.");
		}
		catch(ArithmeticException e){
			System.out.println("Je mag niet delen door 0.");
		}
		finally{
			System.out.println("Het programma is gestopt");
		}

	}

}
