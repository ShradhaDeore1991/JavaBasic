/*49. find out the sum of an A.P. series.
Input the starting number of the A.P. series: 1
Input the number of items for the A.P. series: 10

Output::
The Sum of the A.P. series are :
1 + 5 + 9 + 13 + 17 + 21 + 25 + 29 + 33 + 37 = 190
 */

package array.src.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,i,d=0, n,sum=0;

        try
        {
            System.out.print("Input the Starting number of the A.P. series: ");
            a = Integer.parseInt(sc.next());
            System.out.print("Input the number for the A.P. series: ");
            n = Integer.parseInt(sc.next());
            System.out.print("Input the common difference of A.P. series: ");
            d = Integer.parseInt(sc.next());
        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println(" Invalid Input ");
            System.out.print("Input the Starting number of the A.P. series: ");
            a = Integer.parseInt(sc.next());
            System.out.print("Input the number for the A.P. series: ");
            n = Integer.parseInt(sc.next());
            System.out.print("Input the common difference of A.P. series: ");
            d = Integer.parseInt(sc.next());
        }
        for ( i = 1,a=1; i <=n ; i++,a+=4)
        {
            sum=sum+a;
            System.out.print(a +" + ");
        }
        System.out.print("\n");
        System.out.print("The Sum Of The A.P Series Are = " +sum);
    }
}

