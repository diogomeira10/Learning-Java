package com.project.sections.DataStructures;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        //HashSet is a collection where every item is unique;

        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);



        System.out.println(cars.contains("Volvo")); // true

        int size = cars.size();

        System.out.println(size); // 4

        cars.clear(); // deletes every item from the collection;

        System.out.println(cars); // []


    }
}
