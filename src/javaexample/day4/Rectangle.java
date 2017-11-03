package javaexample.day4;


import org.tutorial.java.Shape;

// Inheritance -> is a relationship
// Rectangle is a shape
// to implement is a relation ship we use extends keyword

public class Rectangle extends Shape {

    // final keyword on a variable enforces that the variable is constant
    private static final int NOOFSIDES = 4;
    private static final String TYPE = "RECTANGLE";

    private double l;
    private double b;

    public Rectangle(double l, double b){
        //calls parent class constructor
        super(NOOFSIDES,TYPE);
        this.l = l;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        double area = l*b;
        return area;
    }

    @Override
    public double perimeter() {
        double p = 2*(l+b);
        return p;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", b=" + b +
                '}';
    }
}
