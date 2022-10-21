/*12. make such a pattern like right angle triangle with number increased by 1.
Output::
1
2 3
4 5 6
7 8 9 10
*/


package program;

import java.util.Scanner;

public class PatternIncreased {
    public static void main(String[] args)

    {
        int i,j,n ,k=1;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(k++ +"  ");
            System.out.println("  ");
        }
    }
}
