/*9. display the pattern like right angle triangle using an asterisk.
Output::
*
* *
* * *

 */

package program;

import java.util.Scanner;

public class Astrik {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the number how many u want rows::");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        }catch(Exception e) {
            System.out.println("\n"+"Please,Enter valid input");
            System.out.println("Enter the number how many u want rows::");
            n = Integer.parseInt(sc.next());
        }
            for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
