package program;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Leapyear
{
    public static void main(String[] args)
    {
        int year;
        try {

            System.out.println("Enter an Year :: ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
          //  Double year1 = Double.parseDouble();


        }
        catch (InputMismatchException io)
        {
            System.out.println("Enter valid input");
            System.out.println("\n");
            System.out.println("Enter an Year :: ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
        }
        if (year % 4 == 0)
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");

    }
}


