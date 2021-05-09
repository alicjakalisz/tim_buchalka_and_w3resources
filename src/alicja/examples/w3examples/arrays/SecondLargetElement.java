package alicja.examples.w3examples.arrays;

import java.util.Arrays;

public class SecondLargetElement {
    public static void main(String[] args) {
        int[] array={1,10,89,7,8};
        System.out.println("Original Array: "+Arrays.toString(array));
        int secondLargestElement=getSecondLargestElement(array);
        System.out.println(secondLargestElement);
    }

    public static int getSecondLargestElement(int[]array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        if(array.length>1){
            return array[array.length-2];
        }
        else{
            return -1;
        }
    }
}
