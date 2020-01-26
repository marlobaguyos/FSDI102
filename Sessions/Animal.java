package Sessions;

public class Animal {

	String name;
	String type;

	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void attack(Student S) {
		System.out.println(this.name + " " + this.type + " is attacking ... " + S.name);
	}

}