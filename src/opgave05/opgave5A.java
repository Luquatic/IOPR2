package opgave05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class opgave5A extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Opgave 5: Cirkel");

		//Circle
		Circle c1 = new Circle();
		c1.setCenterX(200.0f);
		c1.setCenterY(200.0f);
		c1.setRadius(100.0f);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.WHITE);

		//Label
		Text t1 = new Text(100, 100, "Opgave 5: Cirkel");
		t1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25));

		//StackPane
		StackPane sp = new StackPane();
		sp.setStyle("-fx-background-color: grey;");
		sp.getChildren().addAll(c1, t1);

		//Scene
		Scene s1 = new Scene(sp, 200, 200, Color.rgb(0, 0, 0));
		primaryStage.setScene(s1);
		primaryStage.show();





	}

}
