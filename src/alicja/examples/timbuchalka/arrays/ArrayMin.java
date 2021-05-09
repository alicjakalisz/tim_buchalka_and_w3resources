package alicja.examples.timbuchalka.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {

    public static void main(String[] args) {
        int count;
        boolean hasInt=true;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number of elements for the array: ");
        hasInt=scanner.hasNextInt();
        while(!hasInt){
            scanner.nextLine();
            System.out.println("The answer needs to be a number");
            System.out.println("Please enter again: ");
            hasInt=scanner.hasNextInt();

        }
        count=scanner.nextInt();
        scanner.nextLine();
        int[]array=readIntegers(count);
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));



    }

    public static int[] readIntegers(int numberOfElements){
        int[]array=new int[numberOfElements];
        int input=0;
        Scanner scanner= new Scanner(System.in);
        boolean hasInt=true;
        for (int i = 0; i <numberOfElements ; i++) {
            System.out.println("Give the number of : "+(i+1)+" element: ");
            hasInt=scanner.hasNextInt();
            while(!hasInt){
                System.out.println("Number needs to be an integer");
                scanner.nextLine();// we need to clear the buffer (this is one string with \n)
                hasInt=scanner.hasNextInt();

            }

            input=scanner.nextInt();
            scanner.nextLine();
            array[i]=input;

        }
        scanner.close();
        return array;
    }
    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }



}
