package alicja.examples.w3examples.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareArrayLists {

    //Write a Java program to compare two array lists

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,4,6,3,5);
        List<Integer>list2= new ArrayList<>();
        Collections.addAll(list2,1,4,6,5,5);
        boolean isEqual=list.equals(list2);
        System.out.println(isEqual);
        boolean isEquals= isEqual(list,list2);
        System.out.println("List "+list+" and "+ list2+ " is equal? "+ isEqual);
    }

    public static boolean isEqual(List<Integer> list1,List<Integer> list2 ){
        if(list1.size()!=list2.size()){
            return false;
        }
        for (int i = 0; i <list1.size() ; i++) {
         if(list1.get(i)!=list2.get(i)){
             return false;

         }

        }

        return true;
    }
}
