/*15.calculate the factorial of a given number.
        Input the number : 5
        Expected Output :
        The Factorial of 5 is: 120*/

package program;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int i, fact = 1, n = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number : ");
            n = Integer.parseInt(sc.next());

            if (n < 0) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("\n" + "Please,Enter valid input");
            System.out.print("Input number : ");
            n = Integer.parseInt(sc.next());
        }

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
