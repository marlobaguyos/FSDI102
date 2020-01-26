package Sessions;

public class Example {

	public static void main(String args[]) {
		Student s1 = new Student("Efren", 29, 7);
		User u1 = new User("Andres", 34);
		Animal a1 = new Animal("Machiato", "Dog");
		Animal a2 = new Animal("Baby", "Shark");
		
		s1.studentDisplay();
		System.out.println(u1.name);
		System.out.println(a1.name);

		a2.attack(s1);
	}
}