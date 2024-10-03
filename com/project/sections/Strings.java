package com.project.sections;

public class Strings {
    public static void main(String[] args) {
        String message = "Hello World!";
        System.err.println(message);
        //String is also a class, so it has built in methods or members
        char firstCharacter = message.charAt(0);
        int messageLength = message.length();
        System.err.println(firstCharacter); // Output is H
    }
}


//In java, Strings are immutable. We can not change them.