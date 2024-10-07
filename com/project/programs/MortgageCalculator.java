package com.project.programs;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        int principal;

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            boolean isInRange = principal > 1000 && principal <= 1_000_000;
            if(!isInRange) {
                System.out.println("Please enter a number between 1,000 and 1,000,000");
                continue;
            } else {
                break;
            }

        }

        float annualInterestRate ;

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            boolean isInRange = annualInterestRate > 0 && annualInterestRate <= 4;
            if (isInRange) {
                break;
            } else{
                System.out.println("Please enter a number bigger than 0 and smaller or equal to 4");
                continue;
            }
            
        }




        System.out.print("Period (Years): ");
        int period = scanner.nextByte();
        
        scanner.close();
        
        float monthlyInterestRate = (annualInterestRate / 100) / 12;
        
        int months = period * 12;

        double mortgagePayment = principal * 
        (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) / 
        (Math.pow(1 + monthlyInterestRate, months) - 1);

        String inCurrency = currency.format(mortgagePayment);

        System.out.println("Your monthly payment is: " + inCurrency);

    }
}