package opgave08;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Opgave8A extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Scherm met event handling");

		//Buttons
		Button btnOk = new Button();
		btnOk.setText("OK");
		btnOk.setOnAction(e -> {
			System.out.println("De OK-knop is geklikt");
		});

		Button btnCancel = new Button();
		btnCancel.setText("Cancel");
		btnCancel.setOnAction(e -> {
				System.out.println("De Cancel-knop is geklikt");
		});

		//FlowPane
		FlowPane fp1 = new FlowPane();
		fp1.getChildren().addAll(btnOk, btnCancel);
		fp1.setAlignment(Pos.CENTER);

		//Scene
		Scene s1 = new Scene(fp1, 200, 250);
		primaryStage.setScene(s1);
		primaryStage.show();
	}

}
