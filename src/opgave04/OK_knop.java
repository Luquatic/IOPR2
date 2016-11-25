package opgave04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class OK_knop extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Mijn eerste scherm");

		//Button
		Button btnOk = new Button();
		btnOk.setText("OK");
		btnOk.setStyle("-fx-border-color: red;"
				+ "-fx-background-color: blue;"
				+ "-fx-text-fill: white;");

		//StackPane
		StackPane root = new StackPane();
		root.setStyle("-fx-background-color: green;");
		root.getChildren().add(btnOk);

		//Scene
		Scene sceneOk = new Scene(root, 600, 250, Color.rgb(0, 0, 0) );
		primaryStage.setScene(sceneOk);
		primaryStage.show();

	}

}
