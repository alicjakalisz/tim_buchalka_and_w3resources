package alicja.examples.w3examples.methods;

import java.util.Scanner;

public class SmallestNumber {

    //1. Write a Java method to find the smallest number among three numbers. Go to the editor
    //Test Data:
    //Input the first number: 25
    //Input the Second number: 37
    //Input the third number: 29
    //Expected Output:
    //
    //The smallest value is 25.0

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


        int smallestNo = smallestNumber(array);
        System.out.println("The smallest no is: " + smallestNo);

    }

    public static int smallestNumber(int[] array) {

        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }


        return smallestNumber;
    }
}

