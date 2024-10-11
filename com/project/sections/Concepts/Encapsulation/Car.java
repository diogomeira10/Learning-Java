package com.project.sections.Concepts.Encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    Car() {
        this.make = "Uknown";
        this.model = "Uknown";
        this.year = 0;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    //Getter Methods
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    //Setter Methods
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }



}
