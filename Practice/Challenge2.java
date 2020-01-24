package Practice;

import java.io.Console;

public class Challenge2 {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        //__Name__ is a __adjective__ __noun__.  They are always __adverb__ __verb__.

        int age = 12;
        if (age < 13) {
          //Insert exit code
        console.printf("Sorry you must be at least 13 to use this program.\n");
        }
        String name = console.readLine("Enter your name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun;
        boolean isInvalidWord;
        /* || two pipe means or */
        do {
            noun = console.readLine("Enter a noun: ");
            isInvalidWord = noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk");
            if (isInvalidWord){
                console.printf("That language is not allowed.  Try again. \n\n");
            }
        } while(noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
        String adverb = console.readLine("Enter an adverb: ");
        String verb = console.readLine("Enter a verb: ");

        console.printf("Your TreeStory:\n---------------------\n");
        console.printf("%s is a %s %s. ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
    
}