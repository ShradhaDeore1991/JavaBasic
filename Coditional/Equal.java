/*1. accept two integers and check whether they are equal or not.
Test Data : 15 15
        Expected Output :
        Number1 and Number2 are equal*/

package program;
import  java.util.Scanner;

public class Equal {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n1 = 0;
            int n2 = 0;
            try {
                System.out.println("Enter first number");
                n1 = Integer.parseInt(s.next());

                System.out.println("Enter second number");
                n2 = Integer.parseInt(s.next());

                if (n1 < 0 && n2 <0) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
                System.out.println("valid input");

                System.out.print("Enter the first number:");
                n1 = Integer.parseInt(s.next());
                System.out.print("Enter the Second number:");
                n2 = Integer.parseInt(s.next());

            }
            if ((n1 - n2) == 0)
                System.out.println("Numbers are equal");
            else
                System.out.println("Numbers are not equal");
        }
    }


