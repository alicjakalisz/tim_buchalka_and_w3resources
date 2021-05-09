package alicja.examples.w3examples.arrays;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {

        int[] numbers=new int[9];
        insertElement(numbers,4,7);
        System.out.println(Arrays.toString(numbers));
        int[] array={1,1,1,2,3,4,5};
        int min=minElement(numbers);
        System.out.println(min);
        getDuplicates(array);
        String[] arrayOfString = {"Kasia","Basia","Marta","Basia"};
        String[] arrayofString2= {"Piec", "Kasia","Basia", "Widelec", "Talerz"};
        System.out.println(Arrays.toString(arrayOfString));
        System.out.println(arrayOfString.length);
        getDuplicatesString(arrayOfString);
        printCommonElements(arrayOfString,arrayofString2);
        int[] arrayDuplicatesNumbers ={1,2,4,1,1,2,1};
        int[] newArray=uniqueArray(arrayDuplicatesNumbers);
        // printin git without duplicates
        System.out.println("Array with the new unique elements: ");
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);

        }


    }


    //Write a Java program to insert an element (specific position) into an array.

    public static void insertElement(int[] array, int index, int value){

        array[index]=value;
    }

    //Write a Java program to find the maximum and minimum value of an array

    public static int minElement(int[] array){

        int min=Integer.MAX_VALUE;

        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }

        }
        return min;

    }

    //Write a Java program to reverse an array of integer values.
    // 1, 2, 3, 4      4,3,2,1
    public static void reverse(int [] array){

        for (int i = 0; i <array.length/2 ; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    // Write a Java program to find the duplicate values of an array of integer values
    // 1,2,3,4
    public static void getDuplicates(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if((array[i]==array[j]) && (i!=j)){
                    System.out.println("i"+ i +" j=" +j+ " duplicate element: "+array[j]);
                }

            }


        }
    }

    //Write a Java program to find the duplicate values of an array of string values.

    public static void getDuplicatesString (String [] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {

                if((array[i]==array[j]) && (i!=j)){
                    System.out.println("i"+ i +" j=" +j+ " duplicate element: "+array[j]);
        }


            }
        }
    }

    // Write a Java program to find the common elements between two arrays (string values)

    public static void printCommonElements(String[] arrayA,String[]arrayB){
        for (int i = 0; i <arrayA.length ; i++) {
            for (int j = 0; j <arrayB.length ; j++) {

                if(arrayA[i].equals(arrayB[j])){
                    System.out.println("Common element: "+ arrayB[j]);
                    break;
                }
            }
        }
    }

    // Write a Java program to remove duplicate elements from an array

    public static int[] uniqueArray(int[] originalArray){
        int uniqueNoOfElements=originalArray.length;// creating int that keeps the number of unique elements, at the beginning it is the same as array lengh, but it is going to decrese every single time we find a duplicate
// run the array checking what elements are duplicates using nested for loops
        for (int i = 0; i <originalArray.length ; i++) { // index i of an array will be checking all the other elements of the array if they are duplicates
            for (int j = i+1; j <uniqueNoOfElements ; j++) {
                if(originalArray[i]==originalArray[j]){ // if element is a duplicate, replace it with last unique number, the last unique number will be later cut off anyawys you are swaping, putting unique number in fron
                    originalArray[j]=originalArray[uniqueNoOfElements-1];// unique numer of Elements initially was the same as the lengh of the array but now we know there is one duplicat
                    //so the lenght of unique numbers will be shorten by 1 so last index is array[uniqueno of elements less1)
                    uniqueNoOfElements=uniqueNoOfElements-1;
                    j--; // in the case that we find a duplicate and swap it with the last unique element, we need to decred j to come back to the previous index in case the last element was a duplicate as well to do one more swap.
                }
            }

        }
        //copying unique number of elements into new array (copy method lt you copy the certain number of first few elements
        int[] newArray=Arrays.copyOf(originalArray,uniqueNoOfElements);
        return newArray;

    }


}
