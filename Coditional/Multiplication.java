/*6. display the multiplication table of a given integer.
Input the number (Table to be calculated) : 15
Output::
15 X 1 = 15
.....
.....
15 X 10 = 150
 */


package program;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args)

    {
        int j,n;
        Scanner sc = new Scanner(System.in);

        //  System.out.print("Input the number(Table to be calculated): ");
        try {
            System.out.print("Input number of terms : "+"\n");
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
        for(int i =1 ;i<=10;i++) {
            for (j = 1; j <= n; j++)
                if(j<=n-1)
                System.out.print(j + " X " + i + " = " + i * j +"      ");
            else
                System.out.println(j + " X " + i + " = " + i * j+"     ");
            }
    }
    }
