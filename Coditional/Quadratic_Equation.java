package program;
import java.util.Scanner;

public class Quadratic_Equation {
	public static void main(String[] Strings)   
	{
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		try {
			System.out.print("Enter the value of a: ");
			a = Integer.parseInt(sc.next());
			System.out.print("Enter the value of b: ");
			b = Integer.parseInt(sc.next());
			System.out.print("Enter the value of c: ");
			c = Integer.parseInt(sc.next());

			if (a < 0 && b<0 && c<0) {
				throw new IllegalArgumentException();
			}

		}catch(Exception e)
		{
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

	double d= b * b - 4.0 * a * c;  
	if (d> 0.0)   
	{  
	double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
	double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
	System.out.println("The roots are " + r1 + " and " + r2);  
	}   
	else if (d == 0.0)   
	{  
	double r1 = -b / (2.0 * a);  
	System.out.println("The root is " + r1);  
	}   
	else   
	{  
	System.out.println("Roots are not real.");  
	}  
	}  

}
