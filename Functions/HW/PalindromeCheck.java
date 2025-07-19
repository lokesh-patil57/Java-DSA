//  Write a Java program tocheckif a number is a palindrome in Java? 

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int temp = a;

        while (temp != 0) {
            int digit = temp % 10;              // Get the last digit
            b =  b * 10 + digit; // Build the reversed number
            temp /= 10;                         // Remove the last digit
        }

        if (a == b) {
            System.out.println(a + " is a palindrome.");
        } else {
            System.out.println(a + " is not a palindrome.");
        }

        sc.close();
    }
}
