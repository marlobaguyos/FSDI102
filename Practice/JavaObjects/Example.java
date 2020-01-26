package Practice.JavaObjects;

public class Example {
	public static void main (String[] args) {
		System.out.println("We are making a new PEZ Dispenser");
		//instantiate a new Pezdispenser object and it creates a new instance.  The dispenser is referred to as an instance of type  Pezdispenser.
		PezDispenser dispenser = new PezDispenser("Yoda");
		System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
	}
}