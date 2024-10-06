package com.project.sections;

import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        //class NumberFormat. is abstract wich means we cannot create an instance of it.
        //NumberFormat currency = new NumberFormat() this flags an error




        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(1234567.891);
        System.out.println(percent);
        System.out.println(result);
    }
}
