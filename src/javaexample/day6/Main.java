package javaexample.day6;

public class Main {

    public static void main(String... args){
        Days d = Days.valueOf("THURSDAY");
        if(d == Days.SUNDAY){
            System.out.println("you were born on holiday");
        }
    }
}
