package javaexample.day10;

import java.util.*;


// AutoBoxing and UnBoxing
// changes primitive type to its corresponding object type
// UnBoxing changes object type to its corresponding primite type

public class MainClass {

    public static void main(final String ...args){
        Employee e1 = new Employee();
        e1.setFirstName("Tej");
        e1.setLastName("Poudel");


        Employee e2 = new Employee();
        e2.setFirstName("Tej");
        e2.setLastName("Poudel");

//        System.out.println(e1.equals(e2));
//
//
//        // Set
//        Set<Integer> set = new HashSet<>();
//        System.out.println(set.add(3));//{value=3}
//        System.out.println(set.add(3));
//        System.out.println(set.add(4));
//
//        for(int setItem:set){
//            System.out.println(setItem);
//        }
//

        Employee e3 = new Employee();
        e3.setFirstName("Muku");
        e3.setLastName("Aryal");


        Set<Employee> employees = new HashSet<>();
        System.out.println(employees.add(e1));
        System.out.println(employees.add(e2));
        System.out.println(employees.add(e3));

        List<String> countriesList = Arrays.asList("India","Pakistan","India","USA","Mexico");
        Set<String> countries = new HashSet<>(countriesList);

        for(String country:countries){
            System.out.println(country);
        }


        // abc bca
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());

        // Map: dictionary (key,value pair)
        // Map interface and its implementation is HashMap
        // put(key,value)
        // map hashcode and equals method
        // map key are unique

        // key is integer and value is boolean
        // check to see if 1-10 numbers are present in array
        Map<Integer,Integer> integerMap = new HashMap<>();
        int arr[] = {1,2,3,4,5,1,2,3,14,1};


        //{{1,2}.{2,1},{3,1},{4,1},{5,1},
        for(int item:arr){
            if(!integerMap.containsKey(item)) {
                integerMap.put(item, 1);
            }else{
                integerMap.put(item, integerMap.get(item)+1);
            }
        }
        System.out.println("program exiting");
    }
}
