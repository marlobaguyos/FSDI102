package PLANTSZOMBIES;

public class Zombie extends GraphicObject {
	
	public String name;

	public Zombie(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println("Moving Zombie ... my name is " + this.name);
	}
}