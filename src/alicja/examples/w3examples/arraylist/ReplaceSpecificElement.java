package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReplaceSpecificElement {

    //Write a Java program to update specific array element by given element
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        System.out.println(list);
        list.set(1,9); // list element in the index 1 (so 1) was replaced by 9.
        System.out.println(list);
    }
}
