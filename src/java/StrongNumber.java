/*47. check whether a number is a Strong Number or not.
Input a number to check whether it is Strong number: 15
15 is not a Strong number.
 */
  /* If sum of factorial of digits is equal to original number then it is Strong number */


package array.src.java;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        boolean n = false;
        int rem,n1 = 0, sum = 0,temp = n1;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number : " );
        try {

            n1 = Integer.parseInt(sc.next());

            if(n1<0)
            {
                System.out.println("Please,enter the valid number.....");
                System.out.print("\nEnter the number : " );
                n1 = Integer.parseInt(sc.next());
            }
        }catch (Exception e){
            System.out.println("Please,enter the valid number.....");
            System.out.print("\nEnter the number : " );
             n1 = Integer.parseInt(sc.next());
        }
        int i;
        int fact_n,lastdig;
        int total = 0;
        int temp_n = n1;
        while(n1 != 0)
        {
            i = 1;
            fact_n = 1;
            lastdig = n1 % 10;
            while(i <= lastdig)
            {
                fact_n = fact_n * i;
                i++;
            }
            total = total + fact_n;
            n1 = n1/ 10;
        }
        if(total == temp_n)
            System.out.println(temp_n + " is a strong number\n");
        else
            System.out.println(temp_n + " is not a strong number\n");
        System.out.println();


    }
}
