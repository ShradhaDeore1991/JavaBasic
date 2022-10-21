/*20. display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.
       Output
        *
      * * *
    * * * * *
 */

package program;

import java.util.Scanner;

public class OddAstrikPyramid {
    public static void main(String[] args) {
        int i,j,n = 0;
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Input number of rows for this pattern :");
            n = Integer.parseInt(sc.next());

            if(n<0)
            {
                System.out.println("Please enter valid Input::");
                n = Integer.parseInt(sc.next());

            }
        }catch(Exception e){
            System.out.println("Please enter valid Input::");
            n = Integer.parseInt(sc.next());
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<=n-i;j++)
                System.out.println(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println("\n");
        }
    }

}
