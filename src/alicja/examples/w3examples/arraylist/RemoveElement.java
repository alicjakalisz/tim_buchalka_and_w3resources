package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    //Write a Java program to remove the third element from a array list

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(2); // removing elemet of index3
        System.out.println(list);
    }
}
