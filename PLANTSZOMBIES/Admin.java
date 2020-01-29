package PLANTSZOMBIES;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Admin {

	public ArrayList<GraphicObject> listElements; //declaration of the Array

	public Admin() {
		listElements = new ArrayList<GraphicObject>(); //Creating the actual element

		listElements.add(new Zombie("Herman"));
		listElements.add(new GreenBallon("Green1"));
		listElements.add(new Zombie("German"));
		listElements.add(new GreenBallon("Green1"));
		listElements.add(new Zombie("Peter"));
		listElements.add(new SilverBallon("Silver1"));
		listElements.add(new SilverBallon("Silver1"));

		TimerTask timerTask = new TimerTask() {
			public void run() {
				moveFigures();
			}
		};

		Timer timer = new Timer();
		timer.schedule(timerTask, 0, 5000);
	} //closing constructor

	public void moveFigures() {
			
		for(GraphicObject go: listElements) {
			go.move();
		}
		System.out.println("----------------------------");
	}

	public static void main (String[] args) {
		Admin admin = new Admin();

	}

}
