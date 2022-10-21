/*13. make such a pattern like a pyramid with numbers increased by 1.
Output::
   1
  2 3
 4 5 6
7 8 9 10
 */


package program;

import java.util.Scanner;

public class NumberPyramid {
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
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }
        System.out.println("** Printing the pattern... **");

        int count = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
