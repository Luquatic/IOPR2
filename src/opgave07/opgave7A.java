package opgave07;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class opgave7A extends Application{

	public static double getal(double x) {
		double getal = 0.0125;
		return getal * (Math.pow(x, 2));
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
	Pane p1 = new Pane();

	//Polyline
	Polyline pl1 = new Polyline();
	ObservableList<Double> list = pl1.getPoints();

	for (int x = -100; x <= 100; x++) {
		list.add(x + 200.0);
		list.add(200 - getal(x));
	}

	//Assen
	Line line1 = new Line(10, 200, 390, 200);
	Line line2 = new Line(200, 30, 200, 0);

	/*Maken van een Line
	 * (Hoe ver van linker kant af, Y hoogte links v/d lijn, lengte v/d lijn, Y hoogte rechts v/d lijn)
	 */

	//Pijlen
	Line line3 = new Line(390, 200, 370, 190);
    Line line4 = new Line(390, 200, 370, 210);
    Line line5 = new Line(200, 30, 190, 50);
    Line line6 = new Line(200, 30, 210, 50);

    //Labels X en Y
    Text text1 = new Text(380, 170, "X");
    Text text2 = new Text(220, 40, "Y");

    //Shapes toevoegen
    p1.getChildren().addAll(pl1, line1, line2, line3, line4, line5, line6, text1, text2);

    //Scene
    Scene s1 = new Scene(p1, 400, 250);
    primaryStage.setScene(s1);
    primaryStage.show();


	}
}
