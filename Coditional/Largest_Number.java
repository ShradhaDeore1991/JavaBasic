package program;
import java.util.Scanner;

public class Largest_Number {
	public static void main(String[] args) 
    {
        int x = 0, y = 0, z = 0;
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter the first number:");
            x = Integer.parseInt(s.next());
        System.out.print("Enter the second number:");
            y = Integer.parseInt(s.next());
        System.out.print("Enter the third number:");
            z = Integer.parseInt(s.next());

            if (x < 0 && y<0 && z<0) {
                throw new IllegalArgumentException();
            }

        }catch(Exception e) {
         	System.out.println("Invalid Input");
	  		  System.out.println("Please,enter valid Input");

	  		   System.out.print("Enter first number :");
            x = Integer.parseInt(s.next());
	  		 System.out.print("Enter Second number :");
            y = Integer.parseInt(s.next());
	  		 System.out.print("Enter Third number :");
            z = Integer.parseInt(s.next());
        }
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}