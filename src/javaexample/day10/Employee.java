package javaexample.day10;

// Object
// Set -> all the items in set are properly defined
// All of them are unique
// My rule two employees are same if they have same first and last name.
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }

        Class c = o.getClass();
        Class thisClass = getClass();

        if (o == null || thisClass != c) {
            return false;
        }

        Employee employee = (Employee) o;// safe type casting

        if (!getFirstName().equals(employee.getFirstName())) {
            return false;
        }
        return getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        return result;
    }
}
