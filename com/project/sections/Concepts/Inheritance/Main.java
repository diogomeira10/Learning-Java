package com.project.sections.Concepts.Inheritance;

public class Main {
    public static void main(String[] args) {

        // inheritance = the process where one class aquires,
        // the attributes and methods of another;

        Bycicle bycicle = new Bycicle();
        bycicle.Pedalling();
        bycicle.stop();
        bycicle.go();

        bycicle.speed = 2;

        System.out.println(bycicle.speed);

        Car car = new Car();
        System.out.println(car.doors); // 4
        car.go();

    }
}