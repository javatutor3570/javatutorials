package javaexample.day11;

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(final String ... args){
        List<Employee> employees = new ArrayList<>();
        Employee nullEmp = null;
        employees.add(new Employee("muku","aryal",null,PhoneType.MOBILE));
        employees.add(nullEmp);
        employees.add(new Employee("Amrit","aryal",null,PhoneType.BUSINESS));
        employees.add(new Employee("Tej","Paudel",null,PhoneType.MOBILE));

        try {
            validateEmployees(employees);
        }catch (BadDataException ex){
            ex.printStackTrace();
            System.out.println("program exited gracefully");
        }catch (NullPointerException ex){
            ex.printStackTrace();
            System.out.println("null pointer exited gracefully");
        }
    }


    public static void validateEmployees(List<Employee> employees){

        for(Employee e : employees){
            if( PhoneType.BUSINESS.equals(e.getType()) && e.getCompanyName()==null){
                throw new BadDataException(e.toString() + ":phone type with business should have company name");
            }
        }

    }

}
