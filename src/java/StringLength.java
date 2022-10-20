/*58. find the length of a string without using the library function.
Input a string : welcome
The string contains 7 number of characters.
So, the length of the string welcome is : 7
 */

package array.src.java;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        int i=0;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        char ch[]=str.toCharArray();

        for(char c : ch)
        {
            i++;
        }
        System.out.println("Length of the string = "+i);
    }
}
