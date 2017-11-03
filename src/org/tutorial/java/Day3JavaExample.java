package org.tutorial.java;

// Constructor -> object create ( creates space in  memory )
// special method whose name is that of class name
// By default class has one constructor i.e., public className(){}
// There should be no return statement in constructor ( return ...)_
// implicitly returns instance of its type.

// public className(arg1,arg2,.....){}

public class Day3JavaExample {

    public static void main(String[] args) {
        Name name = new Name("Prashant");

        System.out.println(name);

        Name naam = new Name();

        System.out.println(naam);

//        Triangle t = new Triangle(3,"triangle",1,2,3);
//        double p = t.getPerimeter();

        //Shape s = new Shape(1,"abc");
    }
}

