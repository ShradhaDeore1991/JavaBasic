/*26. find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
Input the number of terms : 5
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
 */

package program;

import java.util.Scanner;

public class SeriesSameNumber {
    public static void main(String[] args) {

        int n,i;
        long sum=0;
        long  t=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of terms : ");
        n = Integer.parseInt(sc.next());
        for(i=1;i<=n;i++)
        {
            System.out.print(" "+t);
            if (i<n)
            {
                System.out.print(" + ");

            }
            sum=sum+t;
            t=(t*10)+1;
        }
       System.out.println("\nThe Sum is : "+ sum);

    }
}
