package javaexample.day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployee {
    public static void main(final String... args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(null);
        employees.add(new Employee("ravi", "teja"));
        employees.add(new Employee("navi", "deol"));
        employees.add(new Employee("kumar", "kancha"));
        employees.add(new Employee("ram", "kancha"));
        employees.add(new Employee("adcd", "efgh"));
        employees.add(new Employee("kavi", "teja"));
        employees.add(new Employee("ravi", "deol"));
        employees.add(new Employee("bobby", "deol"));
        employees.add(new Employee("davi", "teja"));
        employees.add(new Employee("eavi", "teja"));

        Map<String,List<Employee>> grp = groupByLastName(employees);

        for(String key:grp.keySet()){
            List<Employee> emloyees = grp.get(key);
            System.out.println("--------------------------------"+key+"---------------------------");
            for(Employee e : emloyees){
                System.out.println(e);
            }
        }
    }

    public static Map<String,List<Employee>> groupByLastName(final List<Employee> employees) {
        Map<String, List<Employee>> groups = new HashMap<>();

        for (Employee e : employees) {

            if (e == null) {
                continue;
            }

            List<Employee> el = groups.get(e.getLastName());

            if (el == null) {
                el = new ArrayList<>();
                groups.put(e.getLastName(), el);
            }
            el.add(e);
        }
        return groups;
    }
}

