package alicja.examples.w3examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {

    //list, data strucuture instead of alicja.examples.arrays.
    //Array dont have methods (apart from lenght) so lists are more usuefull as they have a lot of utility methods

    // List l= new ArrayList();
    //l:


    public static void main(String[] args){
        List<String> l= new ArrayList<String>();
        l.add("David");
        l.add("Alicja");
        l.add("Javier");
        System.out.println(l);
        System.out.println(l.contains("Alicja"));
        List<Integer>l2=new ArrayList<Integer>();
        l2.add(1);
        l2.add(4);
        System.out.println(l2);
        List<Integer> l3= Arrays.asList(5,6,46,3,6,3,8);// does not take any modifications so we cannot change the input or add new numebrs to the list!
        // (if we use this option to uploade all of the number in one go
        System.out.println(l3);
        l2.add(5);
        System.out.println(l2);
        l2.addAll(l3);
        System.out.println(l2);
        System.out.println(l2.indexOf(6));// you put number and it finds you this number and give you the index, or if it doesnt find you anything then it returns -1;
        System.out.println(l2.get(4));// you put index in the parenthesis and you will get a number under this index for list 2
        System.out.println(l2.remove(5));
        System.out.println(l2);

        Integer[] convertedListToArray=(Integer[])l2.toArray();// we can also convert a list into Array " CovertedListtoArray",
        // we have assigined the result to this array, but before we needed to cast the result outcome from Object (List) to Integer Array
        // WE CANNOT CONVERT OBJECT INTO PRIMTIIVE TIME (int) using casting so we need to use wrapper class of int - INTEGER.

    }




}
