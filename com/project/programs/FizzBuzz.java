package com.project.programs;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        
        //If the number is divisible by five , the result is Fizz. If divisible by 3 the result should be Buzz. If divisible by 3 and 5, result is fizzBuzz. Else return the number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int number = scanner.nextInt();

        scanner.close();

        if( (number % 3 == 0) && (number % 5 == 0) ) {
            System.out.println("FizzBuzz");
        } else if(number % 3 == 0){
            System.out.println("Buzz");
        } else if(number % 5 == 0 ){
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }


    }
}
