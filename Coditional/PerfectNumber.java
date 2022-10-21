/*27. check whether a given number is a perfect number or not.
Input the number : 56
The positive divisor : 1 2 4 7 8 14 28
The sum of the divisor is : 64
So, the number is not perfect.
 */

package program;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n,i,sum;
        int mn,mx;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input the  number : ");
            n = Integer.parseInt(sc.next());

            if(n<0){
                System.out.println("Please,enter the valid input");
                System.out.println("Input the  number : ");
                n = Integer.parseInt(sc.next());
            }
        }catch(Exception e){
            System.out.println("Please,enter the valid input");
            System.out.println("Input the  number : ");
            n = Integer.parseInt(sc.next());
        }
        sum = 0;
        System.out.println("The positive divisor  : ");
        for (i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
                System.out.print(" "+i);
            }
        }
        System.out.println("\nThe sum of the divisor is : "+sum);
        if(sum==n)
            System.out.println("\nSo, the number is perfect.");
        else
            System.out.println("\nSo, the number is not perfect.");
        System.out.println("\n");

    }
}
