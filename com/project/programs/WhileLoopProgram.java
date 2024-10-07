package com.project.programs;

import java.util.Scanner;

public class WhileLoopProgram {
    public static void main(String[] args) {
        String input = "";

        // the following code does not work because String is a reference type;
        /*
         * while(input != "quit") {
         * 
         * }
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            input = scanner.nextLine();
            if (input.equals("pass"))
                continue;

            if (!input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }

        scanner.close();

        // do while loop
        // The difference is the piece of code that is going to be executed in a do
        // while loop, is going to be active at least once;
        /*
         * do {
         * System.out.print("Input: ");
         * input = scanner.nextLine();
         * } while (!input.equals("quit"));
         */

    }
}