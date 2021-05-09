package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // creating empty list
        Collections.addAll(list,1,3,4,6,4,3); // adding elements at once to the list
        list.add(7); // adding 1 element;
        System.out.println("List before sorting: "+ list) ;
        Collections.sort(list); // sorting elements
        System.out.println("List after sorting elements: "+ list);
        Collections.shuffle(list);// shufling elements
        System.out.println("List after shuffling elements: "+ list);

    }
}
