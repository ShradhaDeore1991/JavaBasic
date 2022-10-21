/*25. display the n terms of square natural number and their sum.
Input the number of terms : 5
The square natural upto 5 terms are :1 4 9 16 25
The Sum of Square Natural Number upto 5 terms = 55
 */

package program;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        int i,n,sum=0;
          Scanner sc = new Scanner(System.in);
          try {
              System.out.println("Input the number of terms : ");
              n = Integer.parseInt(sc.next());

              if(n<0){
                  System.out.println("Please,enter valid input");
                  System.out.println("Input the number of terms : ");
                  n = Integer.parseInt(sc.next());
              }
          }catch (Exception e){
              System.out.println("Please,enter valid input");
              n = Integer.parseInt(sc.next());

          }
          System.out.println("\nThe square natural upto  terms are :"+n);
            for(i=1;i<=n;i++)
            {
                System.out.print(" "+ i*i);
                sum+=i*i;
            }
            System.out.println("\nThe Sum of Square Natural Number upto " +n +" terms ::"+ sum);

    }
}
