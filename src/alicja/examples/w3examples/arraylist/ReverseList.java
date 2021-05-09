package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    // Write a Java program to reverse elements in a array list
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        Collections.addAll(list,1,3,5,7,3,6);
        System.out.println("List before reversing: " + list);
        Collections.reverse(list);
        System.out.println("List after reversing: "+ list);

    }
}
