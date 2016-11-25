package opgave01;

import javafx.scene.paint.Color;

public class Vierkant extends Figuur {

	private double lengteZijde1 = 1.0;

	public Vierkant() {
		super();
	}

	public Vierkant(double lengteZijde1, Color achtergrondkleur, Color omtrekkleur) {
		super(achtergrondkleur, omtrekkleur);
		this.lengteZijde1 = lengteZijde1;
	}

	public void setLengteZijde1(double lengteZijde1) {
		this.lengteZijde1 = lengteZijde1;
	}

	public double getLengteZijde1() {
		return this.lengteZijde1;
	}

	public double berekenOmtrek() {
		return this.lengteZijde1 * 4;
	}

	public String toString() {
		return "De vierkant heeft een zijde van " +lengteZijde1 +" en een omtrek van " +berekenOmtrek() +".";
	}
}
