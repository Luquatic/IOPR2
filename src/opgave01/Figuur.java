package opgave01;

import javafx.scene.paint.Color;

public abstract class Figuur {

	//achtergrondkleur en omtrekkleur
	//Scopes kunnen public, private & protected zijn

	protected Color achtergrondkleur = Color.WHITE;
	protected Color omtrekkleur = Color.BLACK;

	public Figuur() {

	}

	public Figuur(Color achtergrondkleur, Color omtrekkleur) {
		this.achtergrondkleur = achtergrondkleur;
		this.omtrekkleur = omtrekkleur;
	}

	public void setAchtergrondkleur(Color achtergrondkleur) {
		this.achtergrondkleur = achtergrondkleur;
	}

	public Color getAchtergrondkleur() {
		return this.achtergrondkleur;
	}

	public void setOmtrekkleur(Color omtrekkleur) {
		this.omtrekkleur = omtrekkleur;
	}

	public Color getOmtrekkleur() {
		return this.omtrekkleur;
	}
}
