package javatutorial.day5;

// interface is a contract
// class implements interface
// class implementing interface should implement all the methods inside interface
// keywords such as public, private is not specified for methods inside interface
public interface Calculator {
    double add(double a, double b);
    double mul(double a, double b);
    double sub(double a, double b);
    double div(double a,double b);
}
