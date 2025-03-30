package com.bridgelabz;

public class ExceptionPropogationInMethods {

    // Method 1: Throws ArithmeticException
    public static void method1() {
        System.out.println("Executing method1...");
        int result = 10 / 0;
    }

    // Method 2: Calls method1()
    public static void method2() {
        System.out.println("Executing method2...");
        method1();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Executing main...");
            method2(); // Exception propagates to main
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main.");
        }
    }
}
