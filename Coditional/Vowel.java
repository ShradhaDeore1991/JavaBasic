package program;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        char c = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the character : ");
            c = sc.next().charAt(0);

            if (c < 0) {
                throw new IllegalArgumentException();
            }
        }catch(Exception e){

        }
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println("The character : " +c + " is a vowel");
        else
            System.out.println("The character : " +c + " is a consonant");
    }
}
