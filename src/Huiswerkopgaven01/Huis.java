package Huiswerkopgaven01;

public class Huis extends Gebouw {

	private String soort;

	public Huis(int oppervlakte) {
		super(oppervlakte);
		this.soort = soort;
	}

	public void printStatus() {
		super.printStatus();
		System.out.println("Het gebouw is een " +this.soort);
	}

	public void setHuurprijs(double prijs) {
		huurprijs = prijs;
	}

}
