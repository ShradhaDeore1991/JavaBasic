/*29. check whether a given number is an armstrong number or not.
Input a number: 153
153 is an Armstrong number.
 */

package program;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input  a number: ");
            n = Integer.parseInt(sc.next());

            if(n<0){
                System.out.println("Please,enter the valid input");
                System.out.println("Input  a number: ");
                n = Integer.parseInt(sc.next());
            }
        }catch(Exception e)
        {
            System.out.println("Please,enter the valid input");
            System.out.println("Input  a number: ");
            n = Integer.parseInt(sc.next());
        }
        	    for(temp=n;n!=0;n=n/10){
        	         r=n % 10;
        	         sum=sum+(r*r*r);
        	    }
        	    if(sum==temp)
                    System.out.println(temp+" is an Armstrong number.\n");
        	    else
                    System.out.println(temp+" is not an Armstrong number.\n");
        	}


}
