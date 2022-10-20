/*54. convert an octal number into binary.
Input an octal number (using digit 0 - 7) :57

Output::
The Octal Number : 57
The equivalent Binary Number : 101111
 */

package array.src.java;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        int octal=0,decimal=0,n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal number: ");
        octal = Integer.parseInt(sc.next());
        try {
            System.out.print("Enter a binary number : ");
            octal = Integer.parseInt(sc.next());

            if(n<0){
                System.out.println("Please,enter the valid number.....");
                System.out.print("Enter a binary number : ");
                octal = Integer.parseInt(sc.next());
            }
        }catch (Exception e){
            System.out.println("Please,enter the valid number.....");
            System.out.print("Enter a binary number : ");
            octal = Integer.parseInt(sc.next());
        }

        //writing logic for the octal to decimal conversion
        while(octal > 0)
        {
            int temp = octal % 10;
            decimal += temp * Math.pow(8, n);
            octal = octal/10;
            n++;
        }

        int binary[] = new int[20];
        int i = 0;

        //writing logic for the decimal to binary conversion
        while(decimal > 0)
        {
            int r = decimal % 2;
            binary[i++] = r;
            decimal = decimal/2;
        }

        //printing result
        System.out.print("Binary number : ");

        for(int j = i-1 ; j >= 0 ; j--)
            System.out.print(binary[j]+"");

    }

}
