package javaexample.day11;

public class ExceptionExample {

    public static void main(final String ...args){
       a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        try {
            System.out.println(5 / 0);
        }catch (ArithmeticException ex){
            ex.printStackTrace();
            throw new RuntimeException("denominator cannot be zero");
        }
    }
}
