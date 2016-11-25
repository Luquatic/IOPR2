package opgave12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circleVergrotenVerkleinen2 extends Application {

	public void start(Stage PrimaryStage) {
		PrimaryStage.setTitle("VergrotenVerkleinen");

		//Cirkel
		Circle c1 = new Circle(100);
		c1.setStroke(Color.WHITE);
		c1.setFill(Color.BLACK);

		Button Vergroten = new Button("Vergroten");
		Button Verkleinen = new Button("Verkleinen");
		Button Reset = new Button("Reset");

		Vergroten.setOnAction(e -> {
			c1.setRadius(c1.getRadius() + 10);
		});
		Verkleinen.setOnAction(e -> {
			c1.setRadius(c1.getRadius() - 10);
		});
		Reset.setOnAction(e -> {
			c1.setRadius(100);
		});

		HBox hbox = new HBox();
		hbox.getChildren().addAll(Vergroten, Verkleinen, Reset);
		hbox.setAlignment(Pos.CENTER);

		BorderPane bp = new BorderPane();
		bp.setBottom(hbox);
		bp.setCenter(c1);

		Scene scene = new Scene(bp, 500, 500);
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
