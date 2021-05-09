package alicja.examples.w3examples.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Averageof3Numbers {
    //2. Write a Java method to compute the average of three numbers. Go to the editor
    //Test Data:
    //Input the first number: 25
    //Input the second number: 45
    //Input the third number: 65
    //Expected Output:
    //
    //The average value is 45.0

    public static void main(String[] args) {

        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int input;
        int[] array = new int[3];// empty array of 3 elements

        while (i < array.length) {
            System.out.println("Give the number: ");
            input = scanner.nextInt();

            array[i] = input;
            i++;
        }
        System.out.println("the elements of array:" + Arrays.toString( array));
        float average=getAverage(array);
        System.out.println("The average of the array is: " + average);

    }

    public static float getAverage(int[] array){

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];

        }
        int average=sum/array.length;

        return average;
    }
}
