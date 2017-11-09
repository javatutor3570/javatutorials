package javaexample.day8;

// array is a collection of similar data types
// collection of integer
// collection of string
// collection of employees (employee object type)
// syntax declare = datatype array_name[];
// example int a[] --> can store multiple integers
// example Employee e[] ---> can store multiple employees
// example String s[] -> can store multiple string

// array in java is object type therefore space for it has to be initialized by using new keyword.
// int a[] = new int[10] -> a[0].....a[9] [ int a0, int a2, int a3, int a4.... int a9 }
// a[i] such that i = 0 to 9;

// Employee e[] = new Employee[20] --> 0 to 20 inclusive
// e[i] such that i = 0 to 19;

public class ArrayExample {

    public  static void main(final String ... args){
        final Student s[] = new Student[3];


        final Student s1 = new Student();
        s1.setMarks(80);
        s1.setName("Makunda");

        final Student s2 = new Student();
        s2.setMarks(90);
        s2.setName("Lekhnath");

        final Student s3 = new Student();
        s3.setMarks(60);
        s3.setName("Tejendra");

        s[0] = s1;
        s[1] = s3;
        s[2] = s2;

        for(int i = 0; i<3;i++){
            System.out.println(s[i]);
        }

    }
}
