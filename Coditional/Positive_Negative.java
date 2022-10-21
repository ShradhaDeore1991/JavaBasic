package program;
import java.util.Scanner;

public class Positive_Negative {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		try {

	     System.out.print("Enter the number you want to check:");
			n = Integer.parseInt(sc.next());

			if (n < 0) {
				throw new IllegalArgumentException();
			}
		}catch(Exception e) {
			System.out.println("Invalid Input");
	  		  System.out.println("Please,enter valid Input");
	  		   System.out.print("Enter the number you want to check:");
				 n = Integer.parseInt(sc.next());
		}
	     if(n > 0)
	     {
	         System.out.println(n+" is Positive");
	     }
	     else if(n < 0)
	     {
	         System.out.println(n+" is Negative");
	     }
	     else
	     {
	         System.out.println("The given number "+n+" is neither Positive nor Negative ");
	     }
	 }
	
}
