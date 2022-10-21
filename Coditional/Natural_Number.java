package program;

import java.util.Scanner;

public class Natural_Number
{
    public static void main(String[] args)
    {
        int N;
        try {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter a number::");
          N = in.nextInt();
        }catch (Exception e){
    System.out.println("Invalid Input");
    System.out.println("Invalid Input");
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number ");
    N = in.nextInt();
}
        System.out.println("The First 10 Natural Numbers are");
        for(int i = 1; i <= 10; i++)
        {
            System.out.print(i+" ");
        }

    }
}
