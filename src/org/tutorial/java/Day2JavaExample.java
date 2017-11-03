package org.tutorial.java;

public class Day2JavaExample {

    public static void main(String[] args){
        Person tej = new Person(); // int a --> a is an example of integer or a is a integer
        tej.setAge(28);

        // int a;
        Name name = new Name();
        name.setFirstName("Tej");
        name.setLastName("Poudel");

        tej.setNaam(name);
        tej.setSsn("12345678");

        System.out.println(tej);


//        System.out.println("First Name: " + tej.getFirstName() + " Age: " + tej.getAge());
//        System.out.println("First Name: " + lekhnath.getFirstName() + " Age: " + lekhnath.getAge());
    }

}
