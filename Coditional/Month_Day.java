package program;

import java.util.Scanner;

public class Month_Day {
    public static void main(String[] args)
    {
        int month = 0,number_Of_DaysInMonth=0,year = 0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.printf("Enter month number (1-12): ");
            month = Integer.parseInt(sc.next());

            if (month < 0 ) {
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
                number_Of_DaysInMonth = 31;
                break;

            case 2:
                System.out.printf("February");
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }                break;

            case 3:
                System.out.printf("March");
                number_Of_DaysInMonth = 31;
                break;

            case 4:
                System.out.printf("April");
                number_Of_DaysInMonth = 30;
                break;

            case 5:
                System.out.printf("May");
                number_Of_DaysInMonth = 31;
                break;

            case 6:
                System.out.printf("June");
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                System.out.printf("July");
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                System.out.printf("August");
                number_Of_DaysInMonth = 30;
                break;
            case 9:
                System.out.printf("September");
                number_Of_DaysInMonth = 31;
                break;
            case 10:
                System.out.printf("October");
                number_Of_DaysInMonth = 30;
                break;

            case 11:
                System.out.printf("November");
                number_Of_DaysInMonth = 31;
                break;

            case 12:
                System.out.printf("December");
                number_Of_DaysInMonth = 30;
                break;


            default:
                System.out.printf("Invalid weekday number.");
        }
        System.out.printf("\n");
        System.out.println("Total days in month"+" "+number_Of_DaysInMonth);
    }
}
