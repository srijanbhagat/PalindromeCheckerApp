/*
Use Case 3: Palindrome Check Using String Reverse

Description :

This is the use case 3 part of the app
This class demonstrates whether a string is palindrome or not by reversing the string
and comparing it with the original string

our goal is to check whether a string is a palindrome by reversing it.

@author - Srijan
@version - 3.0

*/
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String original = scanner.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Is it a Palindrome? : ");

        if (original.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}