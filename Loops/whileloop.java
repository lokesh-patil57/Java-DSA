package Loops;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; // Initialize a counter variable

        // The loop continues as long as 'count' is less than 5
        while (count < 5) { 
            System.out.println("Current count: " + count);
            count++; // Increment the counter in each iteration
        }
        sc.close();
        
    }
}
