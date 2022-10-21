package program;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) 
	{
		String str="";
		try {
		Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
      //  char[] arr = Str.toCharArray();
		}catch(Exception e){
			System.out.println("Invalid Input");
			  System.out.println("Please,enter valid Input");
			   System.out.print("Enter the number you want to check:");
			  Scanner sc= new Scanner(System.in);
			  String Str = sc.nextLine();
		}
        String rev = "";
    
 for(int i = str.length() - 1; i >= 0; i--)
 {
 rev = rev + str.charAt(i);
 }
   
 System.out.println(rev);
		}
}
