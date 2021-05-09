package alicja.examples.w3examples;

import java.util.Scanner;

public class W3Examples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(isPositive(input));


    }


 /*   Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

    Test Data
    Input number: 35
    Expected Output :
    Number is positive
    */


    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }
}


