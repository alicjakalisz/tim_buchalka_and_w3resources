package alicja.examples.book.arrays;

import java.util.Arrays;

public class ArraysUtilityClass {
// provides a collection of static methods for whcih you dont need to create an object
    public static void main(String[] args) {

        int[] startValues= new int[10];
        Arrays.fill(startValues,100);// all of the elements of the array Start Values are going to be filled with the same value 100
        System.out.println(Arrays.toString(startValues)); // instead of for loop , you can use this function Arrays.toString to print out all elenebts


        int[] copy=Arrays.copyOf(startValues,2); // Arrays.CopyOf(array), int) will copy the first 2 elements of the original array into new array
        System.out.println(Arrays.toString(copy));

        int[] originalRange= {1,2,3,4,5,6,7,8,9,10};
        int[] copyRange=Arrays.copyOfRange(originalRange,2,5); // copy into copyrange the array oroginal array from index range from 2 to 5
        System.out.println(Arrays.toString(copyRange));
        int[] unorder = {2,46,44,3,5,2};
        Arrays.sort(unorder);
        System.out.println(Arrays.toString(unorder));



    }
}
