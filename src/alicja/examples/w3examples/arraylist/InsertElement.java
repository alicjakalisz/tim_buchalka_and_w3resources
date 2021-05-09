package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class InsertElement {

    //Write a Java program to insert an element into the array list at the first position
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(0,5); // element 5 in index 0
        System.out.println(list);
    }
}

