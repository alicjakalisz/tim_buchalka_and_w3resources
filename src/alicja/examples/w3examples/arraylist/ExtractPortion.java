package alicja.examples.w3examples.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtractPortion {

    //Write a Java program to extract a portion of a array list.
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,54,6,3,5,3); // we have created list of the Arrays converted to list. , oher method is Collections.addAll (list,3,5,6)

        List<Integer> substractedList=list.subList(3,5);
        System.out.println("This is original list :"+list);
        System.out.println("This a list after extraction: " + substractedList);


    }
}
