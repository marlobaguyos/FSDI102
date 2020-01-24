package Sessions;

public class Player {

    public String name;
    public int age;
    public String nationality;
    public double salary;



// public void printPlayer(){
//     System.out.println("------------------------");
//     System.out.println
//     System.out.println
//     System.out.println
//}
public void setName(String n){
    name=n;
}

//contructor special method to create objects
//visibility nameMethod
public Player(String n, int a, String t, double s){
    name = n;
    age = a;
    nationality = t;
    salary = s;
}

}

