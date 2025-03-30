package com.bridgelabz;

import java.util.Scanner;

public class ExceptionPropagation {
    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter the interest rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            // Call calculateInterest and print the result
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            // Handle invalid input
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}
