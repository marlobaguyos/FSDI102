package ObjectOrientedProgrammingExercise3.Exercise3;

import java.util.jar.Attributes.Name;

//1. Create a new class named 'Cow'.
class Cow {

  //2. Create a private variable named 'name'. It should be a String, and once it's set we shouldn't be able to change it.
    final private String name;

  //3. Add a constructor that takes a String argument, and in the constructor use that String argument to populate the 'name' variable.
  public Cow(String name) {
    this.name = name;
  }

  //4. Create a getter to return the name of the Cow.
  String getCowName() {
    return name;
  }
}
