package com.project.sections.Concepts.ExpetionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // exception = an event that occurs during the execution of a program that,
        // disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to by: ");
            int y = scanner.nextInt();

            int result = x / y;

            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number!");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("This will always print");
            scanner.close();
        }

    }
}