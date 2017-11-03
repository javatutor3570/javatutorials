package org.tutorial.java;

// basic data type int, double, float, char
// userdefined datatype -> by class

// Person is a user defined data type
public class Person {

    // default constructor
    public Person(){
        System.out.println("construction object");
    }

    // attributes
    private int age;
    private String ssn;
    private Name naam;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Name getNaam() {
        return naam;
    }

    public void setNaam(Name naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", ssn='" + ssn + '\'' +
                ", naam=" + naam +
                '}';
    }
}
