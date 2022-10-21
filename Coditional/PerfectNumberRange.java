/*28. find the perfect numbers within a given number of range.
Input the starting range or number : 1
Input the ending range of number : 50
Output::
The Perfect numbers within the given range : 6 28
 */

package program;

import java.util.Scanner;

public class PerfectNumberRange {
    public static void main(String[] args) {
        int n = 0,i,sum;
        int mn = 0,mx = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input the starting range or number : ");
            mn = Integer.parseInt(sc.next());
            System.out.println("Input the ending range of number : ");
            mx = Integer.parseInt(sc.next());
            if(mn<0) {
                System.out.println("Please,enter the valid input");
                System.out.println("Input the starting range or number : ");
                mn = Integer.parseInt(sc.next());
                System.out.println("Input the ending range of number : ");
                mx = Integer.parseInt(sc.next());
            }
        }catch (Exception e){
            System.out.println("Please,enter the valid input");
            System.out.println("Input the  number : ");
            n = Integer.parseInt(sc.next());
        }
        System.out.print("The Perfect numbers within the given range : ");
        for(n=mn;n<=mx;n++){
            i=1;
            sum = 0;
            while(i<n){
                if(n%i==0)
                    sum=sum+i;
                i++;
            }
            if(sum==n)
                System.out.print(" "+n);
        }

    }
}
