package opgave20;

public class TekstToner extends Main {

	private String woord;
	private int aantalKeer;

	public TekstToner(String woord, int aantalKeer){
		this.woord = woord;
		this.aantalKeer = aantalKeer;
	}

	@Override
	public void run() {
		for (int i = 1; i<=aantalKeer; i++){
			System.out.println(i + ": " + woord);
		}
	}

	public void start() {
		// TODO Auto-generated method stub

	}
}
