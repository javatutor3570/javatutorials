package org.tutorial.java;

// abstract class -> cannot create instance of this class
public abstract class Shape {
    private int noOfSides;
    private String type;


    public Shape(int noOfSides, String type){
        this.noOfSides = noOfSides;
        this.type = type;
    }

    // abstract key word enforce its child classes to
    // provide the proper implementation of these methods
    public abstract double calculateArea();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "noOfSides=" + noOfSides +
                ", type='" + type + '\'' +
                '}';
    }
}
