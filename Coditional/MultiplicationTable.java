/*7. display the multiplication table vertically from 1 to n.
Input upto the table number starting from 1 : 8
Output::
Multiplication table from 1 to 8
1x1 = 1, 2x1 = 2, 3x1 = 3, 4x1 = 4, 5x1 = 5, 6x1 = 6, 7x1 = 7, 8x1 = 8
....
1x10 = 10, 2x10 = 20, 3x10 = 30, 4x10 = 40, 5x10 = 50, 6x10 = 60, 7x10 = 70, 8x10 = 80
 */


package program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        int j,n;
        Scanner sc = new Scanner(System.in);

         System.out.print("Input the number(Table to be calculated): ");
        try {
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }catch(Exception e)
        {
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of terms : "+"\n");
            n =Integer.parseInt( sc.next());
        }
            for(j=1;j<=10;j++)

                System.out.println(n+" X "+j+" = " +n*j);

    }
}
