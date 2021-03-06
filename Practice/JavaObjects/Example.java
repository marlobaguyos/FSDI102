package Practice.JavaObjects;

public class Example {
	public static void main (String[] args) {

		System.out.println("We are making a new PEZ Dispenser");

		System.out.printf("Fun FACT: There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);

		//instantiate a new Pezdispenser object and it creates a new instance.  The dispenser is referred to as an instance of type  Pezdispenser.
		PezDispenser dispenser = new PezDispenser("Yoda");

		System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
		if(dispenser.isEmpty()) {
			System.out.println("Dispenser is empty");
		}

		System.out.printf("Filling the dispenser with delicious PEZ... %n");
		dispenser.fill();
		if(!dispenser.isEmpty()) {
			System.out.printf("Dispenser is full");
		}

		while (dispenser.dispense()) {
			System.out.printf("Chomp! \n");
		}
		if (dispenser.isEmpty()) {
			System.out.printf("Ate all the Pez \n");
		}

		try {
			dispenser.fill(400);
			System.out.println("This will never happen");
		} catch (IllegalArgumentException iae) {
			System.out.println("Whoa there!");
			System.out.printf("The error was %s \n", iae.getMessage());
		}
		
	}
}