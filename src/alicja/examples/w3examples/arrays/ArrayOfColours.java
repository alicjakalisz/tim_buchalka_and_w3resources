package alicja.examples.w3examples.arrays;

import java.util.Scanner;

public class ArrayOfColours {

    //Write a Java program to create a new array list, add some colors (string) and print out the collection
    public static void main(String[] args) {
        String [] colours = new String[3];
        uploadElementFromUser(colours);
        for (int i = 0; i <colours.length ; i++) {
            System.out.println(colours[i]);
        }

    }
    public static void uploadElementFromUser(String[] array){
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Type down colour");
            array[i]=scanner.next();
        }

    }


}
