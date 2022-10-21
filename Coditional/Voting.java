package program;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Voting
{

        public static void main(String args[]) throws InputMismatchException
        {
            Scanner sc = new Scanner(System.in);
            String name="";
            int age=0;
            try
            {
                System.out.println("Enter your Name: ");
                name = sc.nextLine();
                System.out.println("Enter your Age: ");
                age = Integer.parseInt(sc.next());
                Double age1 = Double.parseDouble(name);
            }
            catch (Exception ie)
            {
                System.out.println("Enter valid Input");
                System.out.println("Enter your Age: ");
                age = Integer.parseInt(sc.next());
            }

            if ((age >= 18) && (age <= 100))
            {
                System.out.println("Congratulation " + name + ", You are eligible for Voting");
            }
            else
            {
                System.out.println("Sorry " + name + ", You are not eligible for voting");
            }

        }
    }

