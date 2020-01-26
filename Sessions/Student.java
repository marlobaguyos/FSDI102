package Sessions;

public class Student {
	public String name;
	public int age;
	public int cohortNumber;

	public Student(String name, int age, int cohortNumber) {
		this.name = name;
		this.age = age;
		this.cohortNumber = cohortNumber;
	}

	public void studentDisplay() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Cohort: " + this.cohortNumber);
	}

}