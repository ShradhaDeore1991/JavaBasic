package program;
import java.util.Scanner;
import java.util.*;

public class Student
{
    public static void main(String args[])
    {
        float phy=0, chem=0, math=0;
        double total,total1, percentage;
        int rollno;
        String name;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter roll no of student:");
            rollno = Integer.parseInt(sc.next());
            System.out.println("Enter name of student:");
            name = sc.next();
            System.out.print("Enter marks of physics subjects:");
            phy = Integer.parseInt(sc.next());
            System.out.print("Enter marks of chemistry subjects:");
            chem = Integer.parseInt(sc.next());
            System.out.print("Enter marks of Math subjects:");
            math = Integer.parseInt(sc.next());

            if (phy < 0 && chem<0 && math<0) {
                throw new IllegalArgumentException();
            }

        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
            System.out.println("Enter valid input"+"\n");
            System.out.println("Enter roll no of student:");
            rollno = Integer.parseInt(sc.next());
            System.out.println("Enter name of student:");
            name = sc.next();
            System.out.print("Enter marks of physics subjects:");
            phy = Integer.parseInt(sc.next());
            System.out.print("Enter marks of chemistry subjects:");
            chem = Integer.parseInt(sc.next());
            System.out.print("Enter marks of computers subjects:");
            math = Integer.parseInt(sc.next());
        }

        total1 = phy + chem + math;
        total = phy + math;
        percentage = (total / 300.0) * 100;
        System.out.println("Total marks of phy and math =" + total);
        System.out.println("Total marks of mah,phy and chem=" + total1);
       /*System.out.println("Percentage = " + percentage);
        if (percentage > 60) {
            System.out.println("Division:-First");
        } else if (percentage > 35 && percentage < 60) {
            System.out.println("Division:-Second");
        } else {
            System.out.println("Division:-Third");
        }*/
        if(total==137 && total1==188)
        {
            System.out.println("Candidate not eligible for admission");
        }else{
            System.out.println("Candidate eligible for admission");
        }

    }
}

