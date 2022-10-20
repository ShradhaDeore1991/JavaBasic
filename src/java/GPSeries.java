/*52. find the Sum of GP series.
Input the first number of the G.P. series: 3
Input the number or terms in the G.P. series: 5
Input the common ratio of G.P. series: 2

Output::
The numbers for the G.P. series:
3.000000 6.000000 12.000000 24.000000 48.000000
The Sum of the G.P. series : 93.000000
 */


package array.src.java;

import java.util.Scanner;

public class GPSeries {
           public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            float a,i,d=0, n,sum=0;

            try {
                System.out.print("Input the first number of the G.P. series: ");
                a = Float.parseFloat(sc.next());

                System.out.print("Input the number or terms in the G.P. series: ");
                n = Float.parseFloat(sc.next());

                System.out.print("Input the common ration of G.P. series: ");
                d = Float.parseFloat(sc.next());
            }
            catch(Exception e)
            {
                System.out.println(" Invalid Input ");

                System.out.print("Input the first number of the G.P. series: ");
                a = Float.parseFloat(sc.next());
                System.out.print("Input the number or terms in the G.P. series: ");
                n = Float.parseFloat(sc.next());
                System.out.print("Input the common ration of G.P. series: ");
                d = Float.parseFloat(sc.next());

            }
            for ( i = 1,a=3; i <=n ; i++,a*=2)
            {
                sum=sum+a;

                System.out.print( + a +" ");
            }
            System.out.print("\n");
            System.out.print(" The Sum of the G.P = " +sum);
        }

    }

