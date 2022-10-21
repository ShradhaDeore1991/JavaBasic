package program;
import java.util.Scanner;

public class Height {
	public static void main(String args[])
    {
        int m;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the height:");
            m = Integer.parseInt(sc.next());
            if (m < 0) {
                throw new IllegalArgumentException();
            }
        }  catch(Exception e)
		 {
       	System.out.println("Invalid Input");
	  		  System.out.println("Please,enter valid Input");
             m = Integer.parseInt(sc.next());		 }
        if(m > 175)
        {
            System.out.println("The person is tall.");
        }
        else if(m > 155 && m <= 175)
        {
            System.out.println("The person has average height.");
        }
        else
        {
            System.out.println("The person is dwarf.");
        }
    }

}
