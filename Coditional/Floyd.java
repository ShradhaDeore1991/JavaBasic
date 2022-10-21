/*22. print the Floyd's Triangle.
Output
1
1
10
101
101
10101
 */

package program;

import java.util.Scanner;

public class Floyd {
    public static void main(String args[]) {
        int i, j, n = 0;
        System.out.println("********Floyd's Triangle*******");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of rows::");
            n = Integer.parseInt(sc.next());
            System.out.println("1");

            if (n < 0) {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        } catch (Exception e) {
            System.out.println("Please enter valid Input::");
            n = Integer.parseInt(sc.next());
        }
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    if (j % 2 == 1) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }

    }
}