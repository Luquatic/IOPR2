package opgave18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class tekstwegschrijver extends Application {

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tekstwegschrijver");

		//BorderPane
		BorderPane bp = new BorderPane();
		bp.setPadding(new Insets(5, 5, 5, 5));

		//HBox
		HBox hbox = new HBox();
		bp.setTop(hbox);

		//Textfield
		TextField tf = new TextField();
		hbox.getChildren().addAll(new Label("bestandsnaam: "), tf);

		//TextArea
		TextArea ta = new TextArea();
		bp.setCenter(ta);

		//Button
		Button opslaan = new Button("Opslaan");
		HBox hbox2 = new HBox();
		hbox2.getChildren().add(opslaan);
		hbox2.setAlignment(Pos.CENTER);
		bp.setBottom(hbox2);

		//Event
		opslaan.setOnAction(e -> {
			File bestand = new File(tf.getText());
			System.out.println(bestand.getAbsolutePath());
			textToFile(ta, bestand);
			tf.setText("");
			ta.setText("");
		});

		//Scene
		Scene scene = new Scene(bp, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	//Methodes
	public void textToFile(TextArea ta, File bestand){
		PrintWriter pw;
		try{
			pw = new PrintWriter(bestand);
			pw.println(ta.getText());
			pw.close();
		} catch (IOException e){
			System.out.println("Nothing happens.");
		}
	}

}
