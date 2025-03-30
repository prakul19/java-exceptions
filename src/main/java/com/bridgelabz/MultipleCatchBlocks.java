package com.bridgelabz;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Do you want to initialize the array? (yes/no): ");
            String response = scanner.next();

            int[] array = null; // Initialize to null
            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();
                array = new int[size];

                System.out.println("Enter " + size + " integers:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }
            }

            // Ask the user for the index to access
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();

            // Retrieve and print the value at the specified index
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}

