package opgave14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class textarea extends Application {

	private boodschapScherm secondStage = new boodschapScherm("");

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tekst in textarea of nieuw scherm");

		//BorderPane
		BorderPane bp = new BorderPane();
		bp.setPadding(new Insets(5, 5, 5, 5));

		//TextField & Positie
		TextField tf = new TextField();
		tf.setPromptText("hier moet je tekst intikken...");
		bp.setTop(tf);

		//TextArea & Positie
		TextArea ta = new TextArea();
		bp.setCenter(ta);

		//Buttons in HBox & Positie
		HBox hbox = new HBox();
		Button uitvoer = new Button("Toon in uitvoer");
		Button scherm = new Button("Toon in scherm");
		hbox.getChildren().addAll(uitvoer, scherm);
		hbox.setAlignment(Pos.CENTER);
		bp.setBottom(hbox);

		//Enter event
		tf.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				textfield(tf,ta);
			}
		});

		//Button event
		uitvoer.setOnAction(e -> {
			textfield(tf,ta);
		});

		scherm.setOnAction(e -> {
			String tekst = tf.getText();
			secondStage.toonTekst(tekst);
			tf.setText("");
		});

		//Scene
		Scene scene = new Scene(bp, 600, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	//Methodes
	public void textfield(TextField tf, TextArea ta) {
		String tekst = tf.getText();
		ta.appendText(tekst);
		tf.setText("");
	}

}

