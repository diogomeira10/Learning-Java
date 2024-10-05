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
    }
}
