/*19. display the n terms of harmonic series and their sum.
Input the number of terms : 5
1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
Sum of Series upto 5 terms : 2.283334
 */

package program;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int i, n = 0;
        float s = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" Input number of terms: ");
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
        for (i = 1; i <= n; i++)
        {
            if (i < n)
            {
                System.out.print(  "1/" + i + " + ");
                s += 1 / (float)i;
            }
            if (i == n)
            {
                System.out.println( "1/" + i);
                s += 1 / (float)i;
            }
        }
        System.out.print( " The sum of the series upto " + n + " terms: " + s );

    }
}
