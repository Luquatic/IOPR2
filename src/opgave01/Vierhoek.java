package opgave01;

import javafx.scene.paint.Color;

public class Vierhoek extends Figuur {

	private double lengteZijde1 = 1.0;
	private double lengteZijde2 = 1.0;

	public Vierhoek() {
		super();
	}

	public Vierhoek(double lengteZijde1, double lengteZijde2, Color achtergrondkleur, Color omtrekkleur) {
		super(achtergrondkleur, omtrekkleur);
		this.lengteZijde1 = lengteZijde1;
		this.lengteZijde2 = lengteZijde2;
	}

	public void setLengteZijde1(double lengteZijde1) {
		this.lengteZijde1 = lengteZijde1;
	}

	public double getLengteZijde1() {
		return this.lengteZijde1;
	}

	public void setLengteZijde2(double lengteZijde2) {
		this.lengteZijde2 = lengteZijde2;
	}

	public double getLengteZijde2() {
		return this.lengteZijde2;
	}

	public double berekenOmtrek() {
		return this.lengteZijde1 * lengteZijde2;
	}

	public String toString() {
		return "De zijden hebben de lengtes " + lengteZijde1 +" en " + lengteZijde2 + " die ervoor zorgen dat de driehoek een omtrek van " +
				berekenOmtrek() + " heeft.";
	}

}
