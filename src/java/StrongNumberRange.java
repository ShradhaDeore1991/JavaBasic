/*48. find Strong Numbers within a range of numbers.
Input starting range of number : 1
Input ending range of number: 200

Output::
The Strong numbers are :
1 2 145
 */

package array.src.java;

import java.util.Scanner;

public class StrongNumberRange {
    public static void main(String[] args) {
        int i, n, n1 = 0,j,k,en ,sn ;
        long fact, s1=0;
        System.out.println("*****Find Strong Numbers within an range of numbers*****");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input starting range of number : ");
            sn = Integer.parseInt(sc.next());
            System.out.println("Input ending range of number: ");
            en = Integer.parseInt(sc.next());
            if(sn<0 || en<0){
                System.out.println("Please,Enter valid input");
                System.out.println("Input starting range of number : ");
                sn = Integer.parseInt(sc.next());
                System.out.println("Input ending range of number: ");
                en = Integer.parseInt(sc.next());
            }
        }catch (Exception e) {
            System.out.println("Please,Enter valid input");
            System.out.println("Input starting range of number : ");
            sn = Integer.parseInt(sc.next());
            System.out.println("Input ending range of number: ");
            en = Integer.parseInt(sc.next());
        }
        System.out.print("The Strong numbers are :  ");
        for(k=sn;k<=en;k++) {
            n1 = k;
            s1 = 0;
            for (j = k; j > 0; j = j / 10) {
                fact = 1;
                for (i = 1; i <= j % 10; i++) {
                    fact = fact * i;
                }
                s1 = s1 + fact;
            }
            if (s1 == n1)
            System.out.print(" "+ n1);
        }

    }
}
