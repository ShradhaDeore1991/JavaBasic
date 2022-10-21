package program;
import java.util.Scanner;

public class Day
{
    public static void main(String[] args) {
        int wDay = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);


            System.out.printf("Enter weekday number (0-6): ");
            wDay = Integer.parseInt(sc.next());

            if (wDay < 0) {
                throw new IllegalArgumentException();
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
            System.out.println("Enter valid output");

            System.out.printf("Enter weekday number (0-6): ");
            wDay = Integer.parseInt(sc.next());
        }
        switch (wDay) {
            case 0:
                System.out.printf("Sunday");
                break;

            case 1:
                System.out.printf("Monday");
                break;

            case 2:
                System.out.printf("Tuesday");
                break;

            case 3:
                System.out.printf("Wednesday");
                break;

            case 4:
                System.out.printf("Thursday");
                break;

            case 5:
                System.out.printf("Friday");
                break;
            case 6:
                System.out.printf("Saturday");
                break;

            default:
                System.out.printf("Invalid weekday number.");
        }
        System.out.printf("\n");
    }
}
