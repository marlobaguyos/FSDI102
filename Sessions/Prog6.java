package Sessions;

public class Prog6 {

	public static void main(String args[]) {
		//array
		String[] cars = {"BMW", "Jeep Rubicon", "Audi", "Volvo"};
		int[] ages = {2, 3, 45, 30, 32, 6};

		cars[2] = "Mazda 3";
		// System.out.println(cars[2]);

		// System.out.println(ages[3]);
		// System.out.println(cars.length);

		// int sumA = ages[0] + ages[1];
		// System.out.println(sumA);

		// int i;
		// int sum = 0;
		// for (i = 0; i < ages.length; i++) {
		// 	sum = sum += ages[i];
		// }

		// for (int i=0; i<cars.length; i++) {
		// 	System.out.println(cars[i]);
		// }

		//foreach instruction
		int sumA = 0;
		for(int y: ages){
			sumA = sumA + y;
		}

		System.out.println(sumA);

	}
}