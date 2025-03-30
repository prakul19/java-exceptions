package com.bridgelabz;

import java.util.Scanner;

// Define the custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    private double balance;

    // Constructor to initialize the balance
    public BankTransactionSystem(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    // Method to display the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the initial balance: ");
            double initialBalance = scanner.nextDouble();
            BankTransactionSystem account = new BankTransactionSystem(initialBalance);

            System.out.print("Enter the withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();

            account.withdraw(withdrawalAmount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}
