package javaexample.day8;

// for loop
// for(initialization;condition;increment){//body}
// initialization happens only once before executing anything of loop
// condition is checked before enter into loop body every time
// increment is done at the end of the loop every time

// initialization
// do{//body}while(condition);

// intialization
// while(condition){//body}

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class LoopExample {

    public static void main(final String... args) {
        whileLoopDemo();
        doWhileDemo();
        forDemo();
    }

    public static void whileLoopDemo() {
        int i = 1;
        while (i <= 10) {
            if (isEven(i)) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }

    public static void doWhileDemo() {
        int secret = 10;
        int noOfTrials = 3;
        int guessedNo = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("guess?");
            guessedNo = sc.nextInt();
            noOfTrials--;
        } while (secret != guessedNo && noOfTrials > 0);

        if (guessedNo == secret) {
            System.out.println("congrats");
        } else {
            System.out.println("better luck next time");
        }
    }

    public static void forDemo() {
        // print all the even number from 1 to 10
        for (int i = 1; i <= 10; i = i + 1) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }

        // print all the even numbers from 1 - 10;
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }

    }


    public static boolean isEven(final int no) {
        return no % 2 == 0 ? true : false;
    }
}
