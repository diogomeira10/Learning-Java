package com.project.programs;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();


        System.out.print("Principal: ");
        int principal = scanner.nextInt();


        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();


        System.out.print("Period (Years): ");
        int period = scanner.nextByte();
        
        scanner.close();
        
        float monthlyInterestRate = (annualInterestRate / 100) / 12;
        
        int months = period * 12;

        double mortgagePayment = principal * 
        (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) / 
        (Math.pow(1 + monthlyInterestRate, months) - 1);

        String inCurrency = currency.format(mortgagePayment);

        System.out.println("You're monthly payment is: " + inCurrency);

    }
}