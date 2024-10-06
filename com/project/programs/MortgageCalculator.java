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
        byte period = scanner.nextByte();


        int months = period * 12;

        float amountToPay = principal + (principal * annualInterestRate/100);

        double MortgagePayment = amountToPay / months;

        String inCurrency = currency.format(MortgagePayment);

        


        System.out.println("You're monthly payment is: " + inCurrency);


        scanner.close();

    }
}
