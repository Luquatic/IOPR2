package opgave19;

public class LetterToner implements Runnable{

	private char ch;
	private int getal;

	public LetterToner(char c, int g){
		ch = c;
		getal = g;
	}
	@Override
	public void run() {
		for (int i = 0; i<getal; i++){
			System.out.print(ch + " ");

			if (i % 10 == 0){
				Thread.yield();
			}
			if (i % 50 == 0){
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
