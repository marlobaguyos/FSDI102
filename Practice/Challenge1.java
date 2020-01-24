package Practice;

import java.io.Console;

public class Challenge1 {
    
    public static void main(String[] args) {
        Console console = System.console();
        String response;
        boolean isresponse;
        do {
        response = console.readLine("Do you understand do while loops? ");
        isresponse = response.equalsIgnoreCase("no");
            if(isresponse){
            console.printf("Try again? \n");
            }
        } while(isresponse);
        console.printf("Because you said %s, you passed the test! \n", response);
    }
}