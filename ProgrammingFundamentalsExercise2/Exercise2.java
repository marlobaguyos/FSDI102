package ProgrammingFundamentalsExercise2;

import java.util.Scanner;

public class Exercise2 { 

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        // System.out.println("What is your name: ");
        // String name = sc.nextLine();
        String name;
        boolean noName;
            do {
                System.out.println("What is your name? ");
                name = sc.nextLine();
                noName = name.isEmpty();
                if (noName) {
                System.out.println("You did not print anything.  Please Try again");
                } 
            } while (noName);
            
        int age;
        System.out.println("How old are you? ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid Input:  Use a whole number DUMMY!");
                System.out.println("Lets try again.  How old are you?  ");
                sc.nextLine();
            }
            age = sc.nextInt();

        System.out.println("What is your current salary? ");
        double salary;
            while (!sc.hasNextDouble()){
                System.out.println("Invalid Input:  Use a whole number DUMMY!");
                System.out.println("Lets try again.  Dummy, how much do you make?  ");
                sc.nextLine();
            }
            salary = sc.nextDouble();

        String ballerStatus = name + " is " + age + " years of age making $" + salary + " .  ***Baller Status***.\n";
        System.out.print(ballerStatus);
    }
}


