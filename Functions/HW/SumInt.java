// Write a Java method to compute the sum of the digits in an integer
import java.util.Scanner;

public class SumInt {
    // Method to compute sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;

        // Handle negative numbers
        n = Math.abs(n);

        while (n != 0) {
            int digit = n % 10;  // Get the last digit
            sum += digit;             // Add digit to sum
            n /= 10;             // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
        sc.close();
    }   
}
