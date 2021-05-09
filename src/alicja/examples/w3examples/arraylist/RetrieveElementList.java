package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementList {
// Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void main(String[] args) {
        List<String> colours=new ArrayList<>(); // empty list
        colours.add("Zielony");
        colours.add("Niebieski");
        colours.add("Niebieski");
        colours.add("Czarny");

        // retrieving element of index 3:

        String retrivedElement=colours.get(3);
        System.out.println(retrivedElement);
        // OR directly print out

        System.out.println(colours.get(3));
    }
}
