package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CloningArrayList {

    public static void main(String[] args) {

        //Write a Java program to clone an array list to another array list.

        ArrayList<Integer> list= (ArrayList<Integer>) Arrays.asList(1,3,54,6,4,5);
        System.out.println("List1: "+ list);
        ArrayList<String> al = new ArrayList<String>();

        //Adding elements to the ArrayList
        al.add("Apple");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        System.out.println("ArrayList: "+al);

        ArrayList<String> al2 = (ArrayList<String>)al.clone();
        System.out.println("Shallow copy of ArrayList: "+ al2);
        List<Integer> list2= (ArrayList<Integer>)list.clone();// method clone returns ArrayList so so the list which was assigning to List and which we want to close needs to be casted

    }
}
