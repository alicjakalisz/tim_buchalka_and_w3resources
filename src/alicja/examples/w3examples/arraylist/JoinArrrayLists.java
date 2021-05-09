package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JoinArrrayLists {

    //Write a Java program to join two array lists.

    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(4);
        list1.add(3);
        System.out.println(list1);
        List<Integer> list2= Arrays.asList(1,4,6,4,8);
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list2);
        List<Integer> listJoined= new ArrayList<>();
        listJoined.addAll(list1);
        listJoined.addAll(list2);
        System.out.println(listJoined);

    }
}
