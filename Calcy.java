import java.util.Scanner;

public class Calcy {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int cal;
        int remainder;
        int quotient;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers :- ");
        System.out.println("Enter First Number :- ");
        a = sc.nextInt();
        System.out.println("Enter Second Number :- ");
        b = sc.nextInt();

        System.out.println("Select the operation :- ");
        System.out.println("Enter 1 for Sum + ");
        System.out.println("Enter 2 for Substraction - ");
        System.out.println("Enter 3 for Division / ");
        System.out.println("Enter 4 for Multiplication *");
        int input;
        input = sc.nextInt();

        if (input == 1) {
            // operation for Sum +
    cal = a + b;
          System.out.println("Sum is "+cal);
        } else if (input == 2) {
            // operation for Substraction -
            if (a > b) {
                cal = a - b;
            } else {
                cal = b - a;
            }
            System.out.println("Substracted value is " + cal);
        } else if (input == 3) {
            // operation for Division /
        } else if (input == 4) {
            // operation for Multiplication *

        } else {
            System.out.println("Enter valid input");
        }
    }

}