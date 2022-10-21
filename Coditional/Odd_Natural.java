package program;
import java.util.Scanner;

public class Odd_Natural
{
    public static void main(String[] args)
    {
        int N, i, sum = 0;

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number");
            N = in.nextInt();
        }catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println("Invalid Input");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of terms");
            N = in.nextInt();
        }
        for(i = 0; i <= N; i++)
        {

            if((i%2) == 1)
            {
                System.out.print(i+" ");
                sum += i;
            }
        }

        System.out.print("\n ");
        System.out.print("Sum of all odd numbers between 0 to "
                + N + " = " + sum);
            }
        }


