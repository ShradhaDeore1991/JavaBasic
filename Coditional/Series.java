/*18.find the sum of the series [ 1-X^2/2! +X^4/4!- .........
Input the Value of x :2
Input the number of terms : 5
the sum = -0.415873
value of x = 2.000000
 */

package program;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Series {
    public static void main(String[] args) {
        int i,n,fact=1,sign= -1;
        float x,sum= 0,result;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of n::");
            n = Integer.parseInt(sc.next());
            System.out.println("Enter the value of x::");
            x = Integer.parseInt(sc.next());

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
            for(i=2;i<(2*n);i=i+2)
        {
            //factorial
            fact=fact*i*(i-1);
            //pow(x,i) for calculate power
            sum= (float) (sum+(sign*(pow(x,i))/fact));
            //assign +- signs
            sign=sign*(-1);
        }
        result=1+sum;
        System.out.println("The value of series is %f"+result);

        }

}
