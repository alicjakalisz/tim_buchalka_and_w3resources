package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddElementsAtOnce {

    // Write a Java program to add elements at onnce into an array list.

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        Collections.addAll(list, 1,3,4,56,4,3);
        System.out.println(list);
        List<Integer>list2= new ArrayList<>();
        list2= Arrays.asList(2,3,5,6,4);
        System.out.println(list2);



    }
}
