/*55. convert a decimal number to hexadecimal.
Input any Decimal number: 79
Output::
The equivalent Hexadecimal Number : 4F
 */

package array.src.java;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int dec=0,r;
        String hex = "";

        char hexch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a decimal number: ");
            dec = Integer.parseInt(sc.next());

            if(dec<0){
                System.out.println("Please,enter the valid number.....");
                System.out.println("Enter a decimal number: ");
                dec = Integer.parseInt(sc.next());
            }
        }catch(Exception e){
            System.out.println("Please,enter the valid number.....");
            System.out.println("Enter a decimal number: ");
            dec = Integer.parseInt(sc.next());
        }

        while(dec>0)
        {
            r = dec % 16;
            hex = hexch[r]+hex;
            dec = dec/16;
        }
        System.out.println("The hexadecimal value is " +hex);
    }
}
