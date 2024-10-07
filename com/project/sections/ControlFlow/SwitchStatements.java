package com.project.sections.ControlFlow;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("The role is admin.");
                break;
            case "moderator":
                System.out.println("The role is moderator");
                break;
            
            default:
                System.out.println("You are a guest");
                break;
        }
    }
}
