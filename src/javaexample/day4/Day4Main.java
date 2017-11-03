package javaexample.day4;

import org.tutorial.java.Shape;

public class Day4Main {

    public static void main(String[] args){
        // THis is comment inserted by lekhnath
        double r1 = 10;
        Circle c1 = new Circle(r1);

        double r2 = 15;
        Shape c2 = new Circle(r2);

        Shape c3 = new Circle(40);


        Shape r = new Rectangle(10d,15d);


        System.out.println("Circle c1");
        System.out.println(c1.calculateArea());
        System.out.println(c1.perimeter());

        System.out.println("Circle c2");
        System.out.println(c2.calculateArea());
        System.out.println(c2.perimeter());

        System.out.println("Circle c3");
        System.out.println(c3.calculateArea());
        System.out.println(c3.perimeter());

        printShapeInformation(r);
        printShapeInformation(c1);

    }

    public static void printShapeInformation(Shape s){
        System.out.println(s);
    }
}
