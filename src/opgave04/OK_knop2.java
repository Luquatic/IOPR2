package opgave04;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class OK_knop2 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Mijn tweede scherm");

		//Buttons
		Button btnOk = new Button();
		btnOk.setText("OK");

		Button btnOk2 = new Button();
		btnOk2.setText("OK");

		Button btnOk3 = new Button();
		btnOk3.setText("OK");

		//FlowPane
		FlowPane fp = new FlowPane();
		fp.getChildren().addAll(btnOk2, btnOk3);
		fp.setAlignment(Pos.CENTER);

		//BorderPane
		BorderPane bp = new BorderPane();
		bp.setCenter(btnOk);
		bp.setBottom(fp);

		//Scene
		Scene sceneOk = new Scene(bp, 500, 100);
		primaryStage.setScene(sceneOk);
		primaryStage.show();

	}

}
