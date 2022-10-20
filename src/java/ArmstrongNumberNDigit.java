/*59. check Armstrong number of n digits.
Input an integer : 1634
1634 is an Armstrong number
 */

package array.src.java;

import java.util.Scanner;

public class ArmstrongNumberNDigit {
    public static void main(String[] args) {
        int n = 0, count = 0, a, b, c, sum = 0;
        Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter any integer you want to check: ");
                n = Integer.parseInt(sc.next());

                if(n < 0) {
                    System.out.println("Please,enter the valid number.....");
                    System.out.print("Enter any integer you want to check: ");
                    n = Integer.parseInt(sc.next());
                }
            }catch(Exception e) {
                System.out.println("Please,enter the valid number.....");
                System.out.print("Enter any integer you want to check: ");
                n = Integer.parseInt(sc.next());
            }
                a = n;
                c = n;
            while (a > 0) {
                a = a / 10;
                count++;
            }
            while (n > 0) {
                b = n % 10;
                sum = (int) (sum + Math.pow(b, count));
                n = n / 10;
            }
            if (sum == c) {
                System.out.println(sum + " is Armstrong number");
            } else {
                System.out.println(sum + " is not Armstrong number");
            }

        }
    }


