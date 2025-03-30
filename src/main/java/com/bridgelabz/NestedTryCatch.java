package com.bridgelabz;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            try {
                // Attempt to access the array element at the specified index
                int element = array[index];
                try {
                    // Attempt to divide the array element by the divisor
                    int result = element / divisor;
                    System.out.println("Division result: " + result);
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid array index
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}

