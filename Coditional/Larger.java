package program;
import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		 int m;
        Scanner sc=new Scanner(System.in);
		 try {
             System.out.println("Enter a Number:");
             m = Integer.parseInt(sc.next());

             if (m < 0){
                 throw new IllegalArgumentException();
         }
        }catch(Exception e)
		 {
        	System.out.println("Invalid Input");
	  		  System.out.println("Please,enter valid Input");
	  		   System.out.print("Enter the number you want to check:");
                 m=Integer.parseInt(sc.next());
		 }
        if(m>0)
            System.out.println("n is 1");
        if(m==0)
            System.out.println("n is 0");
        if(m<0)
            System.out.println("n is -1");
    }

}
