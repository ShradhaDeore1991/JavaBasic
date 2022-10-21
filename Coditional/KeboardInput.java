/*4. read 10 numbers from keyboard and find their sum and average.
Input the 10 numbers :
Number-1 :2
....
Number-1 :10
Output:
The sum of 10 number is : 55
The avg is : 5.500000
*/

package program;
import java.util.Scanner;

public class KeboardInput {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int sum = 0, n = 0, count = 0;
            float avg = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Please enter number -" + i);
                while (count < 1)
                {
                    try {
                        n = Integer.parseInt(sc.next());
                        if (n > 0) {
                            sum += n;
                        }
                        if (n > 0) {
                            break;
                        } else
                            System.out.println("Please,Enter the valid input");


                    } catch (Exception e) {
                        System.out.println("Please,Enter the valid input" + i);
                        //  n = Integer.parseInt(sc.next());
                    }
            }
        }
                avg = sum/10;
                System.out.println( "The sum of 10 number is::"+sum);
                System.out.println( "The avg of 10 number is::"+avg);
}
    }
