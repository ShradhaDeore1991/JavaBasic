package program;

import java.util.Scanner;

public class Month {
    public static void main(String[] args)
    {
        int month = 0;
        Scanner sc = new Scanner(System.in);
            try {
                System.out.printf("Enter month number (1-12): ");
                month = Integer.parseInt(sc.next());

            if (month < 0 ) {
                throw new IllegalArgumentException();
            }

                if (month < 0) {
                    throw new IllegalArgumentException();
                }

        }catch (Exception e){
            System.out.println("Invalid input");
            System.out.println("Enter valid output");

            System.out.printf("Enter month number (1-12): ");
            month = Integer.parseInt(sc.next());
        }
        switch (month)
        {
            case 1:
                System.out.printf("January");
                break;

            case 2:
                System.out.printf("February");
                break;

            case 3:
                System.out.printf("March");
                break;

            case 4:
                System.out.printf("April");
                break;

            case 5:
                System.out.printf("May");
                break;

            case 6:
                System.out.printf("June");
                break;
            case 7:
                System.out.printf("July");
                break;
            case 8:
                System.out.printf("August");
                break;
            case 9:
                System.out.printf("September");
                break;
            case 10:
                System.out.printf("October");
                break;

            case 11:
                System.out.printf("November");
                break;

            case 12:
                System.out.printf("December");
                break;


            default:
                System.out.printf("Invalid weekday number.");
        }
        System.out.printf("\n");
    }
}
