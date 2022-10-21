/*8. display the n terms of odd natural number and their sum .
Input number of terms : 10
Output::
The odd numbers are :1 3 5 7 9 11 13 15 17 19
The Sum of odd Natural Number upto 10 terms : 100
 */

package program;

import java.util.Scanner;

public class OddNaturalNumber {
    public static void main(String[] args) {
        int n,i,sum = 0;
        System.out.print("Enter the number::");
        Scanner sc =new Scanner(System.in);
         n = Integer.parseInt(sc.next());
        System.out.print("The natural numbers are::"+n+"\n");
        try {

            if(n<0)
            {
                throw new IllegalArgumentException();
            }

        }catch(Exception e) {

            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Enter the number::");
            n = Integer.parseInt(sc.next());

        }

                for(i=1;i<=n;i++)

                {
                    System.out.print( 2*i-1 + "\t");
                    sum+=2*i-1;
                }
                System.out.print("\n"+"The Sum of odd Natural Number upto " +n+" terms is: " +sum);

            }
        }

