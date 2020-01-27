package ObjectOrientedProgrammingExercise3.Exercise3;

import java.io.Console;

// Start by creating a new Cow class in the 'Cow.java' file.

public class Main {

  public static void main(String[] args) {
    Console console = System.console();
    Cow cow = new Cow("Larry");
    // 5. Create a new Cow named 'Larry'.
    
    
    //Finally, print out the name of your Cow object to make sure everything's working.
    console.printf("I named my cow %s. %n", cow.getCowName());
  }
}