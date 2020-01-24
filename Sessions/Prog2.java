package Sessions;

public class Prog2 {

    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 10;

        //conditional
        if(num1 >= num2){
            if(num1 == num2){
                System.out.println("The number " + num1 + " is greater and equal to " + num2);
            }
            else{
                System.out.println("The first number is greater than the second number");
            }
        }
        else{
            System.out.println("The first number is less than the second");
        }
    }
}