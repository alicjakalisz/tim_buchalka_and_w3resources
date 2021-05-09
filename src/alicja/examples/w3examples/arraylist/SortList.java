package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    //Write a Java program to sort a given array list

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(2);
        System.out.println("List before sorting: " + list);
        Collections.sort(list);
        System.out.println("List after sorting: "+ list);

    }
}
