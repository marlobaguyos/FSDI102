package Sessions;


public class SportSystem {

    public static void main(String args[]) {
        Player p1 = new Player();
        p1.name = "Lionel Messi";
        p1.age = 31;
        p1.nationality = "Argentina";
        p1.salary = 100.00;

        System.out.println(p1.name + " " + p1.age + " " + p1.nationality + " " + p1.salary);
    }
}