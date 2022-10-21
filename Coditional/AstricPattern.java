/*14. make such a pattern like a pyramid with an asterisk.
        Output::
           *
          * *
         * * *
        * * * *      */

/*20. display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.
Output
         *
       * * *
     * * * * *
 */
package program;

import java.util.Scanner;

public class AstricPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        try {
            System.out.println("Enter the number of rows::");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        }catch(Exception e)
        {
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }
        int st = 1; // number of stars
        int sp = n - 1; // number of spaces
        // 1st for loop for rows
        for (int i = 0; i < n; i++) {

            // 2nd for loop for printing spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // 3rd for loop for printing stars
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st += 2;
            sp--;
            System.out.println();
        }
    }
}