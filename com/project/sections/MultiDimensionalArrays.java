package com.project.sections;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        //with curly braces {}
        int[][] ages = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(Arrays.deepToString(ages));

        
    }
}
