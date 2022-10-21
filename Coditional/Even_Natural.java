/*16. display the n terms of even natural number and their sum.
Input number of terms : 5
The even numbers are :2 4 6 8 10
The Sum of even Natural Number upto 5 terms : 30
 */

package program;

import java.util.Scanner;

public class Even_Natural {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number ::");
            n = Integer.parseInt(sc.next());

          if(n<0)
          {
              System.out.println("Please enter valid Input::");
              n = Integer.parseInt(sc.next());

          }
        }catch (Exception e)
        {
            System.out.println("Please enter valid Input::");
            System.out.println("Enter number::");
            n = Integer.parseInt(sc.next());

        }
        System.out.print("The even numbers are :");

        for(i = 0; i <= n; i++)
        {
            if((i%2) == 0)
            {
                System.out.print(i+" ");
                sum += i;
            }
        }

       System.out.println("\n "+"Sum of all even numbers between 0 to "
                + n + " = " + sum);
    }
}

