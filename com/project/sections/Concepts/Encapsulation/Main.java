package com.project.sections.Concepts.Encapsulation;

public class Main {
    public static void main(String[] args) {
        //Encapsulation = attributes of a class will be hidden or private,
        //                  Can be acessed only through methods (getters and setters)
        //                  You should make attributes private if you dont have a reason to make them public;

        Car car = new Car("Chevrolet","Camaro",2021);


        System.out.println(car.getMake()); //Chevrolet
        System.out.println(car.getYear()); //2021
        System.out.println(car.getModel());// Camaro

        car.setYear(2010); 
        System.out.println(car.getYear());//2010



    }
}
