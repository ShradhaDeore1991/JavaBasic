package program;

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double p, area;
        try {
            System.out.print("Enter 3 sides : ");
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            c = Integer.parseInt(sc.next());

            if (a < 0 && b<0 && c<0) {
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("Invalid Input");
            System.out.println("Please,enter valid Input");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            a = Integer.parseInt(sc.next());
            System.out.print("Enter the value of b: ");
            b = Integer.parseInt(sc.next());
            System.out.print("Enter the value of c: ");
            c = Integer.parseInt(sc.next());
        }
        //check is sides can form a triangle
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            // equilateral triangle if all sides are equal
            if ((a == b) && (b == c))
                System.out.println("Equilateral triangle");
                // isosceles triangle if any two sides are equal
            else if ((a == b) || (b == c) || (c == a))
                System.out.println("Isosceles triangle");
                // scalene triangle if no sides are equal
            else
                System.out.println("Scalene triangle");
            // find area
            p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Area of triangle is = " + area);
        }
        else {
            System.out.println("Cannot form a triangle");
        }
    }
}
