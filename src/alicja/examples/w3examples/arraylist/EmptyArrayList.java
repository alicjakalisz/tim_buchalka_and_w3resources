package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        Collections.addAll(list, 1,3,4,5,3,4);
        System.out.println("List with elements: "+ list);
        boolean isEmpty;
        isEmpty=isEmpty(list);
        System.out.println("Is list empty: " + isEmpty);
        list.removeAll(list);
        System.out.println("The same list but without elements: "+ list);



    }

    public static boolean isEmpty(ArrayList<Integer> list){
        for (int element: list){
            if(element!=0){
                return false;
            }
        }
        return true;
    }
}
