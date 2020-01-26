package PLANTSZOMBIES;

public class GreenBallon extends GraphicObject {
	public String name;

	public GreenBallon(String name) {
		this.name = name;
	}

	//Override
	public void move() {
		System.out.println("Moving green ballon ... my name is " + this.name);
	}
}