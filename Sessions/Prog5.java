package Sessions;

import java.util.Scanner;
import java.io.Console;

public class Prog5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        String password = "eureka";
        boolean authenticated = false;
        int trys = 3;
        String secretKey;

        /*
        for(int i=1; i<=trys && !authenticated ; i++){
            System.out.println("Enter the password: ");
            secretKey = sc.nextLine();
            if(secretKey.equals(password)){
                console.printf("My man! Please come in.");
                authenticated = true;
            }
            else{
                console.printf("Try again:\n");
            } 
        }
        */
        int i = 0;
        while (!authenticated && i <= trys){
            secretKey = console.readLine("Enter Password: ");
            if (secretKey.equals(password)){
                console.printf("Welcome");
                authenticated = true;
            }
            if else {
                console.printf("Try Again.\n");
                i = i + 1;
            }
            else {
                if ( i == 3 ) {
                    console.printf("Account Lock Forever");
                }
            }
        }
    }


}