/*10. display the pattern like right angle triangle with a number.
 Output::
1
2 3
4 5 6 */

package program;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args)

    {
        int i,j,n;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e)
        {
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
