package oops.account;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountTester {
    public static void main(String[] args) {
        int count,counter=0,counter2;
        int accountBalance;
      //  String accountNo =0;
        String accountType=null;
        Scanner sc = new Scanner(System.in);
        while(1!=0) {
            System.out.println("Enter your details below:- ");
            System.out.println("Enter Account Number:");
            String number = sc.next();

           if(accountNumberValidate(number))
           {
               try
               {
                 // accountNo = .parseInt(number);
               }catch (NumberFormatException ex)
               {
                   System.out.println("please enter a valid Number");
               }

              break;
           }
           else
           {
               System.out.println("please enter 16 digit account number");
           }
        }
        while (1!=0) {
            System.out.println("Enter Account Type:");
            System.out.println("Enter-1 for Saving");
            System.out.println("Enter-2 for Current");

            counter2 = sc.nextInt();
            switch (counter2) {
                case 1:
                    accountType = "Saving Account";
                    break;
                case 2:
                    accountType = "Current Account";
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            if (counter2 <= 2&& counter2>0) {
                break;
            }
            else {
                System.out.println("Please enter the valid services");
            }
        }
        while (1!=0) {
        System.out.println("Enter Account balance:");
        accountBalance = sc.nextInt();

            if (accountBalance > 0) {
                break;
            } else {
                System.out.println("Account balance never be in negative");
                System.out.println("Please enter positive Number");
            }
        }


        int accountNo = 0;
        NewAccount a = new NewAccount(accountNo,accountBalance,accountType);

        while (counter==0) {
            System.out.println("\nPlease select the services You Want");
            System.out.println("Enter-1 for Deposit");
            System.out.println("Enter-2 for WithDraw");
            System.out.println("Enter-3 for Display Account Details");
            System.out.println("Enter-4 for Display Your Balance");
            System.out.println("Enter-5 for exits");
            count = sc.nextInt();
            switch (count) {
                case 1:
                    System.out.println("Enter amount to be deposit");
                    a.deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount to be withdraw");
                    a.withdraw(sc.nextInt());
                    break;
                case 3:
                    System.out.println(a.displayAccountDetails());
                    break;
                case 4:
                    System.out.println("Your Balance is :"+a.getAccountBalance());
                    break;
                case 5:
                    counter++;
                    break;

                default:
                    System.out.println("please press valid input");
                    break;
            }
        }
        }
    public static  boolean accountNumberValidate(String accountNumber)
    {
        if(accountNumber.length() == 16)
        {
            return true;
        }
        else return false;
    }


    }

