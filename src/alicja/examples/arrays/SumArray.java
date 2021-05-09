package alicja.examples.arrays;

import java.util.Arrays;

public class SumArray {

    public static void main (String args[]){
        int numbers[]= new int[5];
        numbers[0]=3;
        numbers[1]=4;
        numbers[2]=5;
        numbers[3]=7;
        numbers[4]=9;
        System.out.println("Before Calling getSumArray. Array=" + Arrays.toString(numbers));
        int sum=getSumArray(numbers);// [3,4,5,7,9]
        System.out.println(sum);
        float average=getAverage(numbers);
        System.out.println(" Average is "+ average);
        boolean contains1 = containsNumber(numbers,1);
        boolean contains7 = containsNumber(numbers,7);

        System.out.println("Array contains 1?"+ contains1);
        System.out.println("Array contains 7?"+ contains7);
    }

    public static int getSumArray(int[] arrayNumbers){ // taking alicja.examples.arrays as parameters and method execute for loop on parameters and sum up total of the numbers whitin this array
        System.out.println("Start of GetSumArray " + Arrays.toString(arrayNumbers));
        int total=0;
        for(int number: arrayNumbers){

            total=total+number;
            System.out.println("Number is "+ number+ " and total "+ total) ;
        }
        System.out.println("End of GetSumArray  sum=" + total);
       return total;

    }


    public static float getAverage(int[] arrayOfNumbers) {
        float average=0;
        int sum=0;
        for(int number: arrayOfNumbers){
            sum=sum+number;
        }
        average=(float)sum/arrayOfNumbers.length;

        return average;

    }

    public static boolean containsNumber(int[] array,int number){
        for(int n:array){
            if(n==number){
                return true;
            }
        }

        return false;
    }

}
