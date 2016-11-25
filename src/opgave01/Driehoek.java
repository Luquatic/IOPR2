package opgave01;

import javafx.scene.paint.Color;

public class Driehoek extends Figuur {

	private double lengteZijde1 = 1.0;
	private double lengteZijde2 = 1.0;
	private double lengteZijde3 = 1.0;

	public Driehoek() {
		super();
	}

	public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3,
			Color achtergrondkleur, Color omtrekkleur) {
		super(achtergrondkleur, omtrekkleur);
		this.lengteZijde1 = lengteZijde1;
		this.lengteZijde2 = lengteZijde2;
		this.lengteZijde3 = lengteZijde3;
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

	public void setLengteZijde3(double lengteZijde3) {
		this.lengteZijde3 = lengteZijde3;
	}

	public double getLengteZijde3() {
		return this.lengteZijde3;
	}

	public double berekenOmtrek() {
		return this.lengteZijde1 + this.lengteZijde2 + this.lengteZijde3;
	}

	@Override
	public String toString() {
		return "De zijden hebben de lengtes " + lengteZijde1 + ", " + lengteZijde2 +
				" en " + lengteZijde3 + " die ervoor zorgen dat de driehoek een omtrek van " +
				berekenOmtrek() + " heeft.";

	}
}
