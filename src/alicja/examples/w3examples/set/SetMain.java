package alicja.examples.w3examples.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

   //Write a Java program to append the specified element to the end of a hash set.

    // SET has a unique elements and stores them in random order which means they dont have INDEX when you iterate you need to use enhanced loop
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        Collections.addAll(set, 1, 2, 3, 5);
        System.out.println(set);

    }
}
