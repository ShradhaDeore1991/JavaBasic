/*23. display the sum of the series [ 1+x+x^2/2!+x^3/3!+....].
Input the value of x :3
Input number of terms : 5
Output:
The sum is : 16.375000
 */

package program;

import java.util.Scanner;

public class SeriesSum1 {
    public static void main(String[] args) {
        float x,sum,no_row;
        int i,n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input the value of x :");
            x = Integer.parseInt(sc.next());
            System.out.println("Input number of terms : ");
            n = Integer.parseInt(sc.next());

            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }

        }catch(Exception e) {
            System.out.println("\n" + "Please,Enter valid input");
            System.out.println("Enter the value of n");
            n = Integer.parseInt(sc.next());
            System.out.println("Enter the value of x");
            x = Integer.parseInt(sc.next());
        }
        sum =1; no_row = 1;
        for (i=1;i<n;i++)
        {
            no_row = no_row*x/(float)i;
            sum =sum+ no_row;
        }
        System.out.println("\nThe sum  is : "+sum);
    }

}
