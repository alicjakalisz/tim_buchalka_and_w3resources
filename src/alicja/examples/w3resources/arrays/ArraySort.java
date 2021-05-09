package alicja.examples.w3resources.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {


        String arrayString[]={"Marek", "Darek", "Judasz"};
        System.out.println(Arrays.toString(arrayString));
        Arrays.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));


        int[]arrayOfNumbers={1,24,5,63,6};
        System.out.println(Arrays.toString(arrayOfNumbers));
        Arrays.sort(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));

        int[] copyArray=getCopyArray(arrayOfNumbers);
        System.out.println("this is original array: "+Arrays.toString(arrayOfNumbers));
        System.out.println("This is a copy of the original array: " +Arrays.toString(copyArray));

        int element=getIndex(arrayOfNumbers,6);
        System.out.println(element);
        int element2=getIndex(arrayOfNumbers,10);
        System.out.println(element2);
        // program that sum values of the array
        int sum=0;
        for (int i = 0; i <arrayOfNumbers.length ; i++) {

            sum=sum+arrayOfNumbers[i];
        }
        System.out.println(sum);


        //Write a Java program to test if an array contains a specific value
        int input=0;
        boolean isWrong=true;
        System.out.println("Give the number: ");
        while(isWrong==true){
            Scanner scanner=new Scanner(System.in);
            input=scanner.nextInt();
            if(input<=0){
                System.out.println("Give a number which is a positive value");
            }else {
                isWrong=false;
            }
        }


        boolean contains=false;

        for (int i = 0; (i <arrayOfNumbers.length) && (contains==false) ; i++) {
            if(arrayOfNumbers[i]==input){
                System.out.println("Array of Numbers contains: "+input);
                contains=true;
            }
        }
        if(contains==false){  // contains== true is the same as (contains) and contains==false is the same as (!contains)
            System.out.println("This array does not contain: "+input);
        }





    }
    // Write a Java program to find the index of an array element
    public static int getIndex (int[] array, int element){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==element){
                return i;
            }

        }
        System.out.println("there is no such element in the array");
        return -1;

    }
    //   Write a Java program to copy an array by iterating the array

    public static int[] getCopyArray(int[] original){
        int[]copy=new int[original.length];
        for (int i = 0; i <original.length ; i++) {
            copy[i]=original[i];
        }
        return copy;
    }

}
