package com.project.sections;

public class ArithmeticOperations {
    public static void main(String[] args) {
        double result = (double) 10 / (double) 3;
        System.out.println(result); // 3.3333333333333335

        int x = 1;
        int y = x++;
        System.out.println(y); // 1
        y = ++x;
        System.out.println(y); // 3

        //The order of operations are : multiplications/divisions -> sums/subtractions

        String number = "1";
        int stringToNumber = Integer.parseInt(number);
        System.out.println(stringToNumber);


        //The Math Class and Explicit Casting
        //Java converts a smaller type into a larger type size automatically, the contrary is only possible by using explicit Casting
        int randomNumber = (int)Math.round(Math.random() * 100); // generates a number between 0 and 100
        System.out.println(randomNumber);

    }
}
