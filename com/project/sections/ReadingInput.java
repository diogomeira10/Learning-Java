package com.project.sections;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inside the parentheses we specify where we are going to read data from; window or file;

        System.out.print("Enter username: ");

        String userName = scanner.nextLine().trim();
        System.out.println("The username is: " + userName);

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("The age is " + age);


        scanner.close();
    }

}
