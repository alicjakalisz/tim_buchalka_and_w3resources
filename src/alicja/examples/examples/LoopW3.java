package alicja.examples.examples;

import java.util.Arrays;

public class LoopW3 {

    public static void main( String[] args){



        for(int i=0; i<10; i++ ){
            if(i==5){ break;
            }

        }

        int[] simpleArray = {1,2,3};

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for(int i=0;i<myNumbers.length;i++){
            System.out.println("Iteration " + i);
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for(int i=0;i<myNumbers.length;i++){
            System.out.println("Iteration " + i);
            System.out.println(Arrays.toString(myNumbers[i]));
            System.out.println("Going inside of inside loop " + i);
            for (int j=0; j< myNumbers[i].length; j++){
                System.out.println("Element i=" + i + " j=" +j +" is " + myNumbers[i][j]);
            }
        }


    }



}

