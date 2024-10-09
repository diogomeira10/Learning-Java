package com.project.sections.DataStructures;

import java.util.ArrayList;



public class ArrayLists {
 public static void main(String[] args) {

    //ArrayList = a resizable array
    //      Elements can be added and removed after compilation phase
    //      Store reference and data types

    ArrayList<String> food = new ArrayList<String>();

    //add elements to the array with add functions

    food.add("pizza");
    food.add("hamburger");
    food.add("hotdog");

    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }

    //usefull methods

    //   Set
    //      Replaces a index value for something else;
    food.set(0, "sushi");

    System.out.println(food); // [sushi, hamburger, hotdog]

    food.remove(2); // removes hot dog from the arrayList;

    System.out.println(food); // [sushi, hamburger]

    food.clear(); //Deletes all the elements present in the array;

    System.out.println(food);


 }   
}
