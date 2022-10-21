package program;
import exception.InvalidInputException;

import  java.util.Scanner;



public class Temprature
{
        public static void main(String[] args)
        {
            int temp;
            try
            {
                System.out.println("Enter temprature:  ");
                Scanner sc = new Scanner(System.in);
                temp = sc.nextInt();
            }catch (Exception e)
            {
                System.out.println("Invalid input");
                System.out.println("Please enter valid input");
                System.out.println("Enter temprature: ");
                Scanner sc = new Scanner(System.in);
                temp = sc.nextInt();
            }
            if (temp < 0)
            {
                System.out.println("Freezing whether");
            }
            else if (temp == 0 || temp <= 10)
            {
                System.out.println("Very cold whether");
            }
            else if (temp == 10 || temp <= 20)
            {
                System.out.println("cold whether");
            }
            else if (temp == 20 || temp <= 30)
            {
                System.out.println("Normal in tempraturer");
            }
            else if (temp == 30 || temp <= 40)
            {
                System.out.println("Its hot");
            }
            else
            {
                System.out.println("Its very hot");
            }
        }
    }

