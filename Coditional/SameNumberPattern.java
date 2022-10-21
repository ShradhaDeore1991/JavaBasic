/*11. make such a pattern like right angle triangle with a number which will repeat a number in a row.
Output::
1
22
333
4444
*/

package program;

import java.util.Scanner;

public class SameNumberPattern {
    public static void main(String[] args)

    {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number of n : ");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }

        }catch(Exception e){
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of n : ");
            n = Integer.parseInt(sc.next());
        }

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(i);
            System.out.println(" ");
        }
    }
}
