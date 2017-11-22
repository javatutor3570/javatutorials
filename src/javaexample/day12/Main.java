package javaexample.day12;

// new-> creates space for all the attributes
// retrun reference to that space

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String ...args){
        Name n2 = new Name();
        System.out.println(n2);

        Name n1 = new Name("Muku","Aryal");
        System.out.println(n1);

        n1.setFirstName("Amrit");
        System.out.println(n1);

        capName(n1);
        System.out.println(n1);

        n1 = new Name();
        System.out.println(n1);

        int a = 2;
        fun(a);
    }

    public static void fun(int a){
       a = 10;
    }

    public static void capName(Name n){
        n = new Name("Amrit","Aryal");
        n.setFirstName(n.getFirstName().toUpperCase());
        n.setLastName(n.getLastName().toUpperCase());
        System.out.println(n);
    }
}
