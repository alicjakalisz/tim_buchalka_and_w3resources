package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyOneIntoAnother {

    //Write a Java program to copy one array list into another.
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(1);
        System.out.println(list);

        List<Integer> list2= new ArrayList<>();
        list2.add(7);
        list2.add(4);
        list2.add(0);
        list2.add(9);
        System.out.println(list2);

        List<Integer> list3= new ArrayList<>();
        Collections.copy(list2,list); // first argument is a list to be copied into second list
        System.out.println(list);
        System.out.println(list2);

    }
}
