/*56. Check Whether a Number can be Express as Sum of Two Prime Numbers.
Input a positive integer:

Output::
16 = 3 + 13
16 = 5 + 11
 */

package array.src.java;

import java.util.Scanner;

public class PrimeNumberSum {
    public static void main(String[] args) {
        int num,i,j,temp1,temp2,ctr=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("input the number: ");
            num = Integer.parseInt(sc.next());

            if(num<0){
                System.out.println("Please,enter the valid number.....");
                System.out.print("Enter a binary number : ");
                num = Integer.parseInt(sc.next());
            }
        }catch (Exception e) {
            System.out.println("Please,enter the valid number.....");
            System.out.print("Enter a binary number : ");
            num = Integer.parseInt(sc.next());
        }
        for(i=2;i<=num/2;i++){
            temp1=i;
            temp2=num-i;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    ctr++;
                    break;
                }
            }
            if(ctr==0){
                for(j=2;j<=(num-i)/2;j++){
                    if((num-i)%j==0){
                        ctr++;break;
                    }
                }
                if(ctr==0)
                   System.out.println(num+" = "+ temp1+" + "+ temp2);
            }
            ctr=0;
        }

    }
}
