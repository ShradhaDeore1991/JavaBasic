package program;

import java.util.Scanner;

public class Equivalent 
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the grade");
		Scanner sc = new Scanner(System.in);
		char grade =sc.next().charAt(0);
	
			if(grade=='E')
			{
				System.out.println("Excellent");
			}

			else  if(grade=='V')
			{
				System.out.println("Very good");
			}

			else  if(grade=='G')
			{
				System.out.println("Good");
			}

			else  if(grade=='A')
			{
				System.out.println("Average");
			}

			else 
			{
				System.out.println("Fail");
			}
		
	}

}
