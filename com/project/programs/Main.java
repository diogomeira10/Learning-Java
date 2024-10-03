package com.project.programs;
//Functions

// Define the type of value the functions returns: 

//main is the entry point of the program
//functions must belong to a class
//functions that belong to a class are generally called methods.
// classes are used to organize our code
//Every Java program should have at least one class that contains the main function

// In Java , all the classes and methods should have an access modifier. Wich is a keyword that determines if other classes or methods can access these classes and methods. 
//An example of a class modifier is the public and private keyword

//naming classes with Pascal is a convention, 
//naming methods in camelCase is also a convention;

public class Main { //this is the class
    public static void main(String[] args) { // main function
        System.out.println("Hello, World!");
    }
}

//public means the method can be access anywhere
// static means the method can be called without the need of creating an instance of the the class.
//void means it does not return any value. The purpose of the main method is to make the program run and perform tasks. The main method is the starting point of the program so it does not need to return any value
