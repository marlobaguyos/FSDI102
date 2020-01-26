package Practice;

import java.io.Console;

public class Greeter {

  public static void main(String[] args) {
    Console console = System.console();
    // 1. Create a new String named place and assign it a value of your choosing.
    String place = "Anchorage";
    // 2. Using the provided console object, 
    //           prompt the user "What is your first name?" and store that in a variable
    String userName = console.readLine("What is your first name: ");
    // 3. Print out to the console "Hello <FIRST_NAME>!  Welcome to <PLACE>."
    console.printf("Hello %s!  Welcome to %s", userName, place);
  }
  

}