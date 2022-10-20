/*53. convert a binary number to octal.
Input a binary number :1001

Output::
The Binary Number : 1001
The equivalent Octal Number : 11
 */

package array.src.java;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        int decimal = 0,binary,n=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a binary number : ");
            binary = Integer.parseInt(sc.next());

            if(binary<0){
                System.out.println("Please,enter the valid number.....");
                System.out.print("Enter a binary number : ");
                binary = Integer.parseInt(sc.next());
            }
        }catch (Exception e){
            System.out.println("Please,enter the valid number.....");
            System.out.print("Enter a binary number : ");
            binary = Integer.parseInt(sc.next());
        }
         //writing logic for the conversion from binary to decimal
        while(binary > 0)
        {
            int temp = binary%10;
            decimal += temp*Math.pow(2, n);
            binary = binary/10;
            n++;
        }
        int octal[] = new int[20];
        int i = 0;
        //writing logic for the conversion from decimal to octal
        while(decimal > 0)
        {
            int r = decimal % 8;
            octal[i++] = r;
            decimal = decimal / 8;
        }
        //printing result
        System.out.print("Octal number : ");
        for(int j = i-1 ; j >= 0 ; j--)
            System.out.print(octal[j]);
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}
