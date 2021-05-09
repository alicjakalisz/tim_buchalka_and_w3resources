package alicja.examples.timbuchalka.arrays;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[]array= {1,5,6,4,8};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse( int[]array){
        int temp=0;
        for (int i = 0; i <array.length/2 ; i++) {
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }


    }
}
