package Program;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int i,j,n ,k=1,spc;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){
            System.out.println("\n"+"Please,Enter valid input");
            System.out.print("Input number of rows : ");
            n = Integer.parseInt(sc.next());
        }
        spc=n+4-1;
        for(i=1;i<=n;i++)
        {
            for(k=spc;k>=1;k--)
            {
                System.out.println(" ");
            }
            for(j=1;j<=i;j++)
                System.out.print(k++);
            spc--;
          //  System.out.println("  ");
        }
    }
}

