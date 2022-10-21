package program;
import java.util.Scanner;

public class Astrisk
{
    public static void main(String[] args)
    {
        int rows, i, j;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of rows in pattern");
            rows = in.nextInt();
        }catch (Exception e){
            System.out.println("Invalid Input");
            System.out.println("Invalid Input");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of rows in pattern");
            rows = in.nextInt();
        }
        for(i = 1; i <= rows; i++) {
            /* Prints one row of triangle */
            for(j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            /* move to next row */
            System.out.print("\n");
        }
    }
}
