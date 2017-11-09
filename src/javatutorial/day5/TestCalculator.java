package javatutorial.day5;

public class TestCalculator {
    public static void main(final String ... args){
        Calculator c = new CalculatorImpl();
        System.out.println(c.add(2,3));
    }
}
