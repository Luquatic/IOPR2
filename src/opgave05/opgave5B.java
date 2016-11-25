package opgave05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class opgave5B extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Opgave5: Vierhoeken");

		//Vierhoeken
		Rectangle r1 = new Rectangle();
		r1.setWidth(200);
		r1.setHeight(100);
		r1.setFill(Color.RED);
		r1.setStroke(Color.BLUE);

		Rectangle r2 = new Rectangle();
		r2.setY(110);
		r2.setWidth(200);
		r2.setHeight(100);
		r2.setFill(Color.GREEN);
		r2.setStroke(Color.RED);

		Rectangle r3 = new Rectangle();
		r3.setY(220);
		r3.setWidth(200);
		r3.setHeight(100);
		r3.setFill(Color.BLUE);
		r3.setStroke(Color.GREEN);

		//Ellipses
		Ellipse e1 = new Ellipse();
		e1.setCenterX(200);
		e1.setCenterY(50);
		e1.setRadiusX(100.0f);
		e1.setRadiusY(50.0f);
		e1.setFill(Color.RED);
		e1.setStroke(Color.BLUE);

		Ellipse e2 = new Ellipse();
		e2.setCenterX(200);
		e2.setCenterY(160);
		e2.setRadiusX(100.0f);
		e2.setRadiusY(50.0f);
		e2.setFill(Color.GREY);
		e2.setStroke(Color.GREEN);

		Ellipse e3 = new Ellipse();
		e3.setCenterX(200);
		e3.setCenterY(270);
		e3.setRadiusX(100.0f);
		e3.setRadiusY(50.0f);
		e3.setFill(Color.GREENYELLOW);
		e3.setStroke(Color.RED);

		//Pane
		Pane p1 = new Pane();
		p1.getChildren().addAll(r1, r2, r3, e1, e2, e3);

		//Scene
		Scene s1 = new Scene(p1, 500, 340);
		primaryStage.setScene(s1);
		primaryStage.show();
	}


}
