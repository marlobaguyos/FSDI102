package PLANTSZOMBIES;

public class SilverBallon extends GraphicObject {
	String name;

	public SilverBallon(String name) {
		this.name = name;
	}

	public void move(){
		System.out.println("Moving Silver Ballon ... my name is " + this.name);
	}
}