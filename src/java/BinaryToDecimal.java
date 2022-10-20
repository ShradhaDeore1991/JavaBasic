/*46. convert a binary number into a decimal number using math function.
Input the binary number :1010100
The Binary Number : 1010100
The equivalent Decimal Number is : 84
 */

package array.src.java;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n1,b = 0,i=0,j,d;
        double dec=0;
        System.out.println("\n\n*****Convert Binary to Decimal*****\n ");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input  the binary number :");
            b = Integer.parseInt(sc.next());
            if(b<0){
                System.out.println("Please,enter the valid number.....");
                System.out.println("Input  the binary number :");
                b = Integer.parseInt(sc.next());
            }
        }catch (Exception e){
            System.out.println("Please,enter the valid number.....");
            System.out.println("Input  the binary number :");
            b = Integer.parseInt(sc.next());
        }
        n1=b;
        while(b!=0)
        {
            d = b % 10;
            dec=dec+d*pow(2,i);
            b=b/10;
            i++;
        }
        System.out.println("The Binary Number is: "+n1);
        System.out.println("The equivalent Decimal Number is : "+dec);
    }
}
