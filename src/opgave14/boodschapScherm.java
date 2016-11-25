package opgave14;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class boodschapScherm extends Stage{

	private Button sluiten = new Button("Sluit scherm");
	private BorderPane bpBoodschap = new BorderPane();
	private HBox hboxBoodschap = new HBox();
	private Text boodschapText = new Text("");

	public boodschapScherm(String tekst) {
		boodschapText.setFont(Font.font("Verdana", FontWeight.BOLD, 70));
		boodschapText.setFill(Color.RED);
		hboxBoodschap.getChildren().add(sluiten);
		hboxBoodschap.setAlignment(Pos.CENTER);
		bpBoodschap.setCenter(boodschapText);
		bpBoodschap.setBottom(hboxBoodschap);

		sluiten.setOnAction(e -> {
			close();
		});

		Scene boodschapScene = new Scene(bpBoodschap);
		setTitle("Boodschap");
		setScene(boodschapScene);
	}

	public void toonTekst(String tekst) {
		this.boodschapText.setText(tekst);
		sizeToScene();
		show();
	}
}
