package Projects;

public class Droid {

  String name;
  int batteryLevel;
  
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public int energyReport(int energyUsed) {
    int newbatteryLevel = batteryLevel - energyUsed;
    return newbatteryLevel;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public String toString() {
    return "Hello, I am the droid: " + name;
  }




  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    Droid marlo = new Droid("marlo");
    
    System.out.println(codey);
    System.out.println(codey.energyReport(60));

    System.out.println(marlo);
    System.out.println(marlo.energyReport(50));

  }
}