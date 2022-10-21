/*1. display the first 10 natural numbers.
Expected Output :
1 2 3 4 5 6 7 8 9 10*/

/*2. find the sum of first 10 natural numbers.
The first 10 natural numbers:
 1 2 3 4 5 6 7 8 9 10
  The sum is : 55*/

/*3. display n terms of natural number and their sum.
Output::
The first 7 natural number is :
1 2 3 4 5 6 7
The Sum of Natural Number upto 7 terms : 28*/


package program;

import java.util.Scanner;

public class NaturalNumber {

        public static void main(String[] args) {
            int n,i,sum = 0;
            System.out.print("Enter the number::");
            Scanner sc =new Scanner(System.in);

            try {
                n = Integer.parseInt(sc.next());
                if(n<=0)
                {
                    throw new IllegalArgumentException();
                }
                System.out.print("The first "+n+ " natural numbers are::");
                System.out.println("\n");

            }catch(Exception e) {

                System.out.println("\n"+"Please,Enter valid input");
                System.out.print("Enter the number::");
                n = Integer.parseInt(sc.next());

            }
            for(i=1;i<=n;i++) {
                System.out.print(i+" ");
                sum+=i;
            }

            System.out.println("\n"+"The Sum of Natural Number upto "+n+ " terms : " +sum);

        }
    }


