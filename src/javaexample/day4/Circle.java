package javaexample.day4;

import org.tutorial.java.Shape;

public class Circle extends Shape {
    // Circle c = new Circle(17);
    // Circle c1 = new Circle(18);

    private static final int NOOFSIDES=0;
    private static final String TYPE = "Circle";

    private double r;

    public Circle(double r){
        super(NOOFSIDES,TYPE);
        this.r = r;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(r,2);
        return area;
    }

    @Override
    public double perimeter() {
        double p = 2 * Math.PI * r;
        return p;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
