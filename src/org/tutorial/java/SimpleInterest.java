package org.tutorial.java;

public class SimpleInterest {

    public static void main(String[] args) {
        System.out.println(getGrade(30));
        System.out.println(getGrade(80));
        System.out.println(getGrade(70));
        System.out.println(getGrade(55));
    }

    public static double calculateInterest(double p, double t, double r) {
        System.out.println(getGrade(30));
        double i;
        i = (p * t * r) / 100;
        return i;
    }

    /**
     *
     * @param p
     * @return grade which is of string type
     */
    public static String getGrade(double p) {
        if (p >= 80.0) {
            return "Distinction";
        } else if (p >= 60.0) {
            return "First Division";
        } else if (p >= 50) {
            return "Second Division";
        } else {
            return "Fail";
        }
    }
}
