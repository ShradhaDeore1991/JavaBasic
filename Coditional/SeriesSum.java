/*24. find the sum of the series [ x - x^3 + x^5 + ......].
Input the value of x :2
Input number of terms : 5
The values of the series:
2
-8
32
-128
512
The sum = 410
 */

package program;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
            int x,n;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter the value of x ");
                x = Integer.parseInt(sc.next());
                System.out.println("Enter the value of last exponent 'n' ");
                n = Integer.parseInt(sc.next());

                if(n<0)
                {
                    System.out.println("please,enter valid input");
                    System.out.println("Enter the value of x ");
                    x = Integer.parseInt(sc.next());
                    System.out.println("Enter the value of last exponent 'n' ");
                    n = Integer.parseInt(sc.next());
                }
            }catch(Exception e){
                System.out.println("please,enter valid input");
                System.out.println("Enter the value of x ");
                x = Integer.parseInt(sc.next());
                System.out.println("Enter the value of last exponent n ");
                n = Integer.parseInt(sc.next());
            }
            //for loop to print the series
            int sum = x,m=-1,i;
            System.out.println("The values of the series:");
            System.out.println(+x);

            for(i = 1; i < n; i++) {
                int ctr = 2 * i + 1;
                int mm = (int) Math.pow(x, ctr);
                int nn = mm * m;
                System.out.println(nn + " ");
                sum = sum + nn;
                m = m * -1;
            }
            System.out.println("\nThe sum is=" + sum);
    }
}
