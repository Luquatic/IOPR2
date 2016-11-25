package Huiswerkopgaven01;

public class Gebouw {

	private boolean geopend;
	public int oppervlakte;
	protected double huurprijs;

	public Gebouw(int oppervlakte) {
		this.oppervlakte = oppervlakte;
		this.geopend = false;
	}

	public final boolean isOpen() {
		return this.geopend;
	}

	public void printStatus() {
		String openString = (this.geopend) ?"open" : "dicht";
		System.out.println("Het gebouw is " +openString);
	}

}
