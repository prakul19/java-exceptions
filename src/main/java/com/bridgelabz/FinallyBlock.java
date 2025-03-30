package com.bridgelabz;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other unexpected errors
            System.out.println("An unexpected error occurred.");
        } finally {
            // Ensure this message is always printed
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}

