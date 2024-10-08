package com.project.sections.ControlFlow;

public class ForEach {
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Banana", "Apple"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (int i = fruits.length; i > 0; i--) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}