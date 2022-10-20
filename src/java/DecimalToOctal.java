/*50. convert a decimal number into octal without using an array.
Enter a number to convert : 79
The Octal of 79 is 117.
 */

package array.src.java;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 0, i, j, ocno = 0,dn;
        System.out.println("****Convert Decimal to Octal****");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number to convert : ");
            n = Integer.parseInt(sc.next());

            if(n<0)
            {
                System.out.println("Please,enter the valid number.....");
                System.out.println("Enter a number to convert : ");
                n = Integer.parseInt(sc.next());
            }
        }catch (Exception e)
        {
            System.out.println("Please,enter the valid number.....");
            System.out.println("Enter a number to convert : ");
            n = Integer.parseInt(sc.next());
        }
        dn=n;
        i=1;
        for(j=n;j>0;j=j/8)
        {
            ocno=ocno+(j % 8)*i;
            i=i*10;
            n=n/8;
        }

        System.out.println("The Octal of "+dn +" is :: "+ ocno);
    }
}
