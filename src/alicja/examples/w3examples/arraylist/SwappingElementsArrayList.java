package alicja.examples.w3examples.arraylist;

import java.util.Arrays;
import java.util.List;

public class SwappingElementsArrayList {
    // Write a Java program of swap two elements in an array list.

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        swapElements(list,2,3);
        System.out.println(list);

    }
    public static void swapElements (List<Integer> list, int index1, int index2){
        int temp=list.get(index1);
        list.set(index1, list.get(index2));//
        list.set(index2, temp);


    }
}
