package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    // Write a Java program to search an element in a array list
    public static void main(String[] args) {

        List<String> listOfStrings= new ArrayList<>();
        listOfStrings.add("Jeden");
        listOfStrings.add("Dwa");
        listOfStrings.add("Trzy");
        listOfStrings.add("Cztery");
        listOfStrings.add("Piec");

        boolean contains=listOfStrings.contains("Jeden");
        boolean notContains=listOfStrings.contains("Szesc");
        System.out.println(contains);
        System.out.println(notContains);
    }
}

