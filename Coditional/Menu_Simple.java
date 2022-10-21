package program;

import java.util.Scanner;

public class Menu_Simple {
    public static void main(String a[])
    {

        int num1=0,num2=0,option = 0,ex;
        do
        {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("1.Addition "+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division"+"\n"+"5.Exit");
                System.out.println("Enter your choice::");
                option = Integer.parseInt(sc.next());
                if (option != 5) {
                    System.out.println("Enter the first number");
                    num1 = Integer.parseInt(sc.next());
                    System.out.println("Enter the second number");
                    num2 = Integer.parseInt(sc.next());
                } else
                    break;

                if (num1 < 0 && num2 < 0) {
                    throw new IllegalArgumentException();
                }

                }catch (Exception e) {
                System.out.println("Invalid Input");
                System.out.println("Please,enter valid Input");
                System.out.print("Enter the value of num1: ");
                num1 = Integer.parseInt(sc.next());
                System.out.print("Enter the value of num2: ");
                num2 = Integer.parseInt(sc.next());
            }
            switch(option)
            {
                case 1:

                    System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
                    break;
                case 3:
                    if(num2==0)
                    System.out.println("Error!!! In Division denominator cannot be 0!");
                else{
                    System.out.println("In division of "+num1+" by "+num2+" quotient is "+(num1/num2)+" and remainder is "+(num1%num2));}
                    break;
                case 4: break;
                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue?"+"\n"+"1.Yes 2.No");
            ex = Integer.parseInt(sc.next());
        }while(ex==1);
    }
}
