package javaexample.day9;

// List is a collection type
// default values 0(int) 0.0(double float) false(boolean) object type null


import java.util.ArrayList;
import java.util.List;

// List => interface java ma implented by ArrayList and LinkedList
// ArrayList => indexed to access fifth element 4.
// LinkedList => 1<->2<->3<->4<->5
public class ListExample {
    static int arr[] = new int[10]; // 0 - 9 index ko bound
    static int lastInsertedIndex=-1;

    public static void arrayExample(){

        //arr{1,2,3,4,5,6,7,8,9,10}

        for (int i = 0 ;i  < 10 ;i++){
            lastInsertedIndex++;
            arr[lastInsertedIndex] = i;
        }

//        for(int i = 0 ; i < 10; i++){
//            System.out.println(arr[i]);
//        }

        int arr1[] = new int[25];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

        arr = arr1;

        for(int i = 0 ; i <arr.length; i++){
            System.out.println(arr[i]);
        }


    }

    public static void main(final String ...args){
        //arrayExample();
        List<Integer> l = new ArrayList<>(10);

        l.add(3); //=>{3}
        l.add(4);//=>{3,4}
        l.add(5);//=>{3,4,5}
        l.add(0,10);//=>{10,3,4,5}

        for(int i = 0 ;i < l.size();i++){
            System.out.println(l.get(i));
        }

        // for(datatype name:collection) should be read as for each element ( referenced by name) in collection
        // for each a in {10,3,4,5}
        for(Integer i:l){
            System.out.println(i);
        }

        l.remove(3);

        Integer ten = 10;
        l.remove(ten);

        for(Integer i:l){
            System.out.println(i);
        }

    }

}
