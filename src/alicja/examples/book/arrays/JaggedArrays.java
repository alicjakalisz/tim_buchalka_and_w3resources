package alicja.examples.book.arrays;

import java.util.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        int[][] array=new int[3][]; // we have created array of arrays with dynamic number of columns (unknown until we intialise below)
        array[0]=new int[3];// we have iniliazied first  sub-array with 3 elements // first row will have a lengh of 3 elements
        array[1]=new int[1];// we have iniliazied second  sub-array with 1 elements // second row ill have a lenght of 1 element
        array[2]=new int [4];// we have iniliazied third  sub-array with 4 elements// third row will have a lengh of 4 elements
        // they all have 0 values initally. We need to put values now.

        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=3;
        array[1][0]=1;
        array[2][0]=1;
        array[2][1]=2;
        array[2][2]=3;
        array[2][3]=4;
        for (int i = 0; i <array.length ; i++) {  // array lenght is a first [] number of rows/arrays this loop will run then for 3 rows
            for (int j = 0; j < array[i].length; j++) { // array[i].lenght , this is a lenght of subarray i , as each of them will have a different lengh, i=0 is 3 elements, i=1 is 3
                System.out.print(array[i][j]+ "\t");

            }
            System.out.println();
        }



    }
}
