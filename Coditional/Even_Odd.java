package program;
import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) 
    {
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
        if(n % 2 == 0)
        {
            System.out.println(n+" is Even number ");
        }
        else
        {
            System.out.println(n+" is Odd number ");
	}
    }
}
