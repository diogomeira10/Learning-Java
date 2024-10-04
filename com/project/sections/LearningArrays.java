package com.project.sections;

import java.util.Arrays;

public class LearningArrays {
    public static void main(String[] args) {
        // integer array
        int[] numbers = new int[5];
        boolean[] isIt = new boolean[4];
        numbers[0] = 1;
        numbers[1] = 2;
        // numbers[10] = 34; // since there is no 10 index in the array, the java runs
        // an exception, wich is a way to report error;
        String toString = Arrays.toString(numbers); // does not change the array;
        System.out.println(numbers);
        System.out.println(toString);
        System.out.println(Arrays.toString(isIt));
        // Output is
        // [I@372f7a8d
        // [1, 2, 0, 0, 0]
        // [false, false, false, false]

        // adding all the items to the array
        int[] ages = { 10, 20, 30, 22, 12 };
        System.out.println(Arrays.toString(ages));
        // Output: [10, 20, 30, 22, 12]
        
        Arrays.sort(numbers);

        System.out.println(numbers);


    }
}

// Output is
// [I@372f7a8d
// [1, 2, 0, 0, 0]
// [false, false, false, false]