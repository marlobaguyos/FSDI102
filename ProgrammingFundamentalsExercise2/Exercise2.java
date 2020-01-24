package ProgrammingFundamentalsExercise2;

import java.util.Scanner;

public class Exercise2 { 

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        System.out.println("What is your name: ");
        String name = sc.nextLine();
            if (name == " ") {
                System.out.println("You did not print anything.  Please Try again");
            }
        System.out.println("What is your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("What is your current salary? ");
        double salary = Double.parseDouble(sc.nextLine());

        String ballerStatus = name + " is " + age + " years of age making $" + salary + " .  ***Baller Status***.";
        System.out.print(ballerStatus);
    }
}


