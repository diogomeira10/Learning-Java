package com.project.sections.Concepts.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //polymorphism =  greek word for poly-"many", morph-"form"
        //                The ability of an object to identify as more than one type;

        Car car = new Car() ;
        Bycicle bycicle = new Bycicle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bycicle, boat};

        for(Vehicle vehicle : racers) {
            vehicle.go();
        }
        
    }
}
