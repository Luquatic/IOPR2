package opgave12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class consoleTekst extends Application {

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tekst in console");

		//GridPane
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(5, 5, 5, 5));
		gp.setVgap(4);
		gp.setHgap(10);

		//TextField
		TextField text = new TextField();
		gp.getChildren().add(text);

		//Button
		Button console = new Button("Toon in console");
		GridPane.setConstraints(console, 1, 0);
		gp.getChildren().add(console);

		//ButtonEvent
		console.setOnAction(e -> {
			System.out.println(text.getText());
		});

		//Scene
		Scene scene = new Scene(gp, 300, 50);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
