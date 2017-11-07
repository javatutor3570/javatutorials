package javatutorial.day5;

public class CalculatorImpl implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double mul(double a, double b) {
        double m =  a *b;
        return  m;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
