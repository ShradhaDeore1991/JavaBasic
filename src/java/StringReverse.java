/*57. print a string in reverse order.
Input a string to reverse : Welcome
Reversed string is: emocleW
 */

package array.src.java;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string::");
        s = sc.nextLine();
       /* try {
            System.out.println("Enter the string");
            s = sc.nextLine();
        } catch(Exception e){
            System.out.println("Please,enter the valid input");
            System.out.println("Enter the string");
            s = sc.nextLine();
    }*/
        //Stores the reverse of given string
        String revstr = "";

        //Iterate through the string from last and add each character to variable reversedStr
        for(int i = s.length()-1; i >= 0; i--){
            revstr = revstr + s.charAt(i);
        }

        System.out.println("Original string: " + s);
        //Displays the reverse of given string
        System.out.println("\nReverse of given string: " + revstr);
    }
}

