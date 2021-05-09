package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    //Write a Java program to iterate through all elements in a array list
    public static void main(String[] args) {
// LIST is an interface and needs to be imported and Array list is a class )like String, Array etc

        List<Integer> list = new ArrayList<>(); // initally empty lists
        List<String> list_Strings = new ArrayList<String>(); // initially empty lists with no elements

        list.add(1);
        list.add(5);
        list.add(8);
        for (int i = 0; i <list.size() ; i++) {
            list.get(i);
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
