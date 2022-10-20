/*51. convert an octal number to a decimal without using an array.
Input an octal number (using digit 0 - 7) :745

Output:
The Octal Number : 745
The equivalent Decimal Number : 485
 */

package array.src.java;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {

        int n1 = 0, n5 = 0, p = 1, k, ch = 1;
        int dec = 0, i = 1, j, d;

        System.out.println("*****Convert Octal to Decimal*****");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input an octal number (using digit 0 - 7) :");
            n1 = Integer.parseInt(sc.next());
            n5 = n1;

            if(n1<0){
                System.out.println("Please,enter the valid number.....");
                System.out.println("Input an octal number (using digit 0 - 7) :");
                n1 = Integer.parseInt(sc.next());
            }
        }catch (Exception e){
            System.out.println("Please,enter the valid number.....");
            System.out.println("Input an octal number (using digit 0 - 7) :");
            n1 = Integer.parseInt(sc.next());
        }
        for (j=n1;j>0;j=j/10)
        {
            k = n1 % 10;
            if (k >= 8) {
                ch = 0;
            }
        }

        switch (ch) {
            case 0:
                System.out.println("\nThe number is not an octal number. \n\n");
                break;
            case 1:
                n1 = n5;
                for (j = n1; j > 0; j = j / 10) {
                    d = j % 10;
                    if (i == 1)
                        p = p * 1;
                    else
                        p = p * 8;

                    dec = dec + (d * p);
                    i++;
                }
                System.out.println("The Octal Number " + n5 + "\n"+"The equivalent Decimal  Number : " + dec);
                break;

        }
    }
}
