package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElement {

    // Write a Java program to replace the second element of a ArrayList with the specified element.

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        Collections.addAll(list, 1,2,3,5);
        System.out.println("Before changes: " + list);
        replaceElement(list,2,9);
        System.out.println("After changes: "+ list);

    }
    public static void replaceElement (ArrayList<Integer>list, int index, int element){
        list.set(index,element);
    }
}
