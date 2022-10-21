package program;

import java.util.Scanner;

public class Menu_Driven {

    public static void main(String [] args)
    {
        int  choice = 0;
      /*  double area;
        int length, breadth, height, diagonal1, diagonal2;
        int side;
        int radius;*/
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1: Right Angle Triangle");
            System.out.println("2: Area of Equilateral Triangle");
            System.out.println("3: Area of Square");
            System.out.println("4: Area of Rectangle");
            System.out.println("5: Area of Circle");
            System.out.println("6: Area of Rhombus");
            System.out.println("7: Program termination");

            if (choice < 0)
            {
                throw new IllegalArgumentException();
            }

        }catch(Exception e) {
            System.out.println("Invalid Input");
            System.out.println("Please,enter valid Input");
            System.out.print("Make your choice: ");
            choice = Integer.parseInt(sc.next());
        }
        lp : while(true)
        {
            System.out.print("Make your choice: ");
            choice = Integer.parseInt(sc.next());
            switch (choice)
            {
                case 1: // for Right Angled Triangle
                    System.out.print("Enter the height of Right Angle Triangle \n");
                    double height = sc.nextInt();
                    System.out.print("Enter the base of Right Angle Triangle \n");
                    double breadth = sc.nextInt();
                    double area = (height * breadth)/2;
                    System.out.println("Area of the Right Angle Triangle is " + area + "\n\n");
                    break;
                case 2:
                    System.out.print("Enter the side of an Equilateral Triangle \n");
                    double side = sc.nextInt();
                    area=(side * side * Math.sqrt(3)) / 4;
                    System.out.println("Area of the Equilateral Triangle is " + area + "\n\n");
                    break;
                case 3:
                    System.out.print("Enter the side of a Square \n");
                    side = sc.nextInt();
                    area = side * side;
                    System.out.println("Area of the Square is "+ area + "\n\n");
                    break;
                case 4:
                    System.out.print("Enter the length of a Rectangle \n");
                    double length = sc.nextInt();
                    System.out.print("Enter the breadth of the Rectangle \n");
                    breadth = sc.nextInt();
                    area = length * breadth;
                    System.out.println("Area of the Rectangle is " + area + "\n\n");
                    break;
                case 5:
                    System.out.print("Enter the radius of a Circle \n");
                    double radius = sc.nextInt();
                    area = radius * radius * 22 / 7;
                    System.out.println("Area of the Circle is " + area + "\n\n");
                    break;
                case 6:
                    System.out.print("Enter the first diagonal of a Rhombus \n");
                   double diagonal1 = sc.nextInt();
                    System.out.print("Enter the second diagonal of the Rhombus \n");
                    double diagonal2 = sc.nextInt();
                    area = diagonal1 * diagonal2 * 1 / 2;
                    System.out.println("Area of the Rhombus is " + area + "\n\n");
                    break;
                case 7:
                    // exiting from the switch-case as well as from the while loop using its label lp
                    break lp;
                default:
                    System.out.println("Invalid choice! Please make a valid choice. \n\n");
            }
        }
    }
}
