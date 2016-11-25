package opgave21;

import javafx.scene.control.TextField;

public class GetalOpteller implements Runnable{

	private static boolean draaiende = false;
	private int startgetal;
	private TextField tfGetal;

	public GetalOpteller(int startgetal, TextField tfGetal){
		this.startgetal = startgetal;
		this.tfGetal = tfGetal;
	}

	public static void setDraaiende(boolean nDraaiende){
		draaiende = nDraaiende;
	}

	public void run(){
			while(draaiende == true)
			{
				try {
					startgetal++;
					String str = String.valueOf(startgetal);
					tfGetal.setText(str);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}


			}
		}
	}

