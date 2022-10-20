/*58. find the length of a string without using the library function.
Input a string : welcome
The string contains 7 number of characters.
So, the length of the string welcome is : 7
 */


package array.src.java;

import java.util.Scanner;

public class StringLengthWithoutFunction {
    public static void main(String [] args) {

        char s[ ] ={50} ;
        int i, l = 0;

        System.out.println("*****Find the length of a string*****");
        Scanner sc = new Scanner((System.in));
        System.out.println("Input a string : ");
         s = sc.nextLine().toCharArray();
         System.out.println("So, the length of the string string is : ");
        for (i = 0; s[i] != 0; i++) {
            System.out.println(i );

        }

    }
}
