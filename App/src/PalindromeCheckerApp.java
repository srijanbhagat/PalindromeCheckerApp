/*
Use case 2: Print a Hardcoded Palindrome Result

Description :

This is the use case 2 part of the app
This class demonstrates whether a string is palindrome or not
we compare the string using for loop and print if the given string is palindrome or not

our goal is to display whether a hardcoded string is a palindrome

@author - Srijan
@version - 2.0

*/
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : ");

        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
