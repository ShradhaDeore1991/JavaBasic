/*17. make such a pattern like a pyramid with a number which will repeat the number in the same row.
Output::

   1
  2 2
 3 3 3
4 4 4 4

 */

package program;

import java.util.Scanner;

public class SameNumberPyramid {
    public static void main(String[] args)
    {
        int n=0;
        // Create a new Scanner object
        Scanner sc = new Scanner(System.in);
        try {
            // Get the number of rows from the user
            System.out.println("Enter the number of rows needed in the pattern ");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        }catch (Exception e){
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }
        System.out.println("** Printing the pattern... **");

        int count = 1;

        for(int i=1;i<=n;i++)
        {for (int j = n; j > i; j--)
        {
            System.out.print(" ");
        }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(i + " ");
              //  count++;
            }
            System.out.println();
        }
        }
    }

