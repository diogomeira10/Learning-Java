package com.project.sections.ControlFlow;

import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        // We use operators to compare primitive values
        Scanner scanner = new Scanner(System.in);

        int x = 1;
        int y = 2;

        //if statement and equal sign comparison
        if (x == y) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

        System.out.print("Please enter the temperature: ");

        int temperature = scanner.nextInt();

        scanner.close();

        // && Operator
        boolean isWarm = temperature > 20 && temperature < 30;
        if (isWarm) {
            System.out.println("It is a warm temperature today!");
        } else {
            System.out.println("It is not a warm temperature today.");
        }

        // || Operator
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;

        if(isEligible) {
            System.out.println("Person is Eligible");
        } else {
            System.out.println("Person is not Eligible");
        }


        //simplifying if statements
        int income = 120_000;

        /* Intead of doing the following code:

            if(income > 100_000) {
                hasAnHighIncome = true;
            } else {
                hasAnHighIncome = false;
            }
 */
        //It is enough to do thhis 
        boolean hasAnHighIncome = income > 100_000;

        //Deciding the flight classes using the ternary operator;

        String className = hasAnHighIncome ? "First Class" : "Economic class";

        System.out.println(className);

    }
}
