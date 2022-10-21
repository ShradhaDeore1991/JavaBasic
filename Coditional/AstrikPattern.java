/*20. display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.
Output:
           *
         * * *
       * * * * *
     * * * * * * *
   * * * * * * * * *
 */

package program;

import java.util.Scanner;

public class AstrikPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Input number of rows :");
             n = Integer.parseInt(sc.next());

            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input number of rows :");
            n = Integer.parseInt(sc.next());
        }
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
