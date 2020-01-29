package Sessions;

import javax.swing.text.Position;

public class Prog7 {

	public static void main(String[] args) {
		int[] numbers = {3, 5, 7, 6, 3, 2, 9};
		for(int position = 0; position < numbers.length; position++) {
			System.out.println("number: " + numbers[position]);
			
			if (numbers[position] == 7) {
				System.out.println("Lucky Number " + numbers[position] + " Hello EveryOne!!!!!!");
			}

		}

		int sumA = 0;
		for(int position: numbers){
			sumA = sumA + position;
		}
		System.out.println("Your total is: " + sumA);

	}

}