package opgave19;

public class Main {

	public static void main(String[] args) {

		LetterToner taska = new LetterToner('A', 100);
		LetterToner taskb = new LetterToner('B', 100);
		LetterToner taskc = new LetterToner('C', 100);

		Thread threada = new Thread(taska);
		Thread threadb = new Thread(taskb);
		Thread threadc = new Thread(taskc);

		threada.start();
		threadb.start();
		threadc.start();
	}

}
