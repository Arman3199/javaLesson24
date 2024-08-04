package day3;
import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate factorial using a for loop
    public static long factorial(int number) {
        // Factorial of negative numbers is not defined
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        long result = 1; // Initialize result to 1

        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {
            result *= i; // Multiply result by the current number
        }

        return result; // Return the final result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt(); // Read user input

        try {
            long result = factorial(number); // Calculate factorial
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Print error message for invalid input
        }

        scanner.close(); // Close the scanner
    }
}

