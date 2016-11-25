package opgave21;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Schermtellers extends Application {

	public static int getal1;
	public static int getal2;
	public static int getal3;

	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();

	private int startgetal;
	private TextField tfGetal;




	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Voer 3 hele getallen in: ");
		getal1 = input.nextInt();
		getal2 = input.nextInt();
		getal3 = input.nextInt();
		input.close();
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Schermtellers");

		//GridPane
		GridPane gp = new GridPane();

		//Labels
		Label lb1 = new Label("Teller 1:");
		Label lb2 = new Label("Teller 2:");
		Label lb3 = new Label("Teller 3:");
		gp.add(lb1, 0, 1);
		gp.add(lb2, 1, 1);
		gp.add(lb3, 2, 1);

		//TextFields
		gp.add(tf1, 0, 2);
		gp.add(tf2, 1, 2);
		gp.add(tf3, 2, 2);
		tf1.setText(String.valueOf(getal1));
		tf2.setText(String.valueOf(getal2));
		tf3.setText(String.valueOf(getal3));

		//Buttons
		Button start1 = new Button("Start");
		Button stop1 = new Button("Stop");
		Button start2 = new Button("Start");
		Button stop2 = new Button("Stop");
		Button start3 = new Button("Start");
		Button stop3 = new Button("Stop");
		gp.add(start1, 0, 3);
		gp.add(stop1, 0, 4);
		gp.add(start2, 1, 3);
		gp.add(stop2, 1, 4);
		gp.add(start3, 2, 3);
		gp.add(stop3, 2, 4);

		//Event
		start1.setOnAction(e -> {
			GetalOpteller1();
			GetalOpteller go = new GetalOpteller(startgetal, tfGetal);
			GetalOpteller.setDraaiende(true);
			Thread a = new Thread(go);
			a.start();
		});
		stop1.setOnAction(e -> {
			GetalOpteller.setDraaiende(false);
		});

		start2.setOnAction(e -> {
			GetalOpteller1();
			GetalOpteller go = new GetalOpteller(startgetal, tfGetal);
			GetalOpteller.setDraaiende(true);
			Thread a = new Thread(go);
			a.start();
		});
		stop2.setOnAction(e -> {
			GetalOpteller.setDraaiende(false);
		});

		start3.setOnAction(e -> {
			GetalOpteller1();
			GetalOpteller go = new GetalOpteller(startgetal, tfGetal);
			GetalOpteller.setDraaiende(true);
			Thread a = new Thread(go);
			a.start();
		});
		stop3.setOnAction(e -> {
			GetalOpteller.setDraaiende(false);
		});

		//Scene
		Scene scene = new Scene(gp);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public void GetalOpteller1() {
		startgetal = getal1;
		tfGetal = tf1;
	}

	public void GetalOpteller2() {
		startgetal = getal2;
		tfGetal = tf2;
	}

	public void GetalOpteller3() {
		startgetal = getal3;
		tfGetal = tf3;
	}
}
