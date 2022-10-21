/*5. display the cube of the number upto given an integer.
Input number of terms : 5
Number is : 1 and cube of the 1 is :1
Number is : 1 and cube of the 1 is :8
Number is : 1 and cube of the 1 is :27
Number is : 1 and cube of the 1 is :64
Number is : 1 and cube of the 1 is :125
 */

package program;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args)

    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number of terms : ");
            n =Integer.parseInt( sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }

        }catch(Exception e)
        {
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of terms : ");
            n =Integer.parseInt( sc.next());
        }
        for(i=1;i<=n;i++)
        {
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
        }
    }
}
