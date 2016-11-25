package opgave12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circleVergrotenVerkleinen extends Application {

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Een cirkel vergroten en verkleinen");

		//Circle
		Circle c1 = new Circle(100);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.WHITE);

		//Buttons
		Button vergroten = new Button("Vergroten");
		Button verkleinen = new Button("Verkleinen");

		//ButtonsEvent
		vergroten.setOnAction(e -> {
			c1.setRadius(c1.getRadius() +10);
		});
		verkleinen.setOnAction(e -> {
			c1.setRadius(c1.getRadius() -10);
		});

		//StackPane
		StackPane sp = new StackPane();
		sp.getChildren().add(c1);

		//HBox
		HBox hbox = new HBox();
		hbox.getChildren().addAll(vergroten, verkleinen);
		hbox.setAlignment(Pos.CENTER);

		//BorderPane
		BorderPane bp = new BorderPane();
		bp.setCenter(sp);
		bp.setBottom(hbox);

		//Scene
		Scene scene = new Scene(bp, 600, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
