package alicja.examples.examples;

import java.util.Scanner;

public class NumbersDivide {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // instance of SCanner class created and Reference Type Variable of Class Scanner and name scanner created. It is pointing to the memot where object sits.
        System.out.println("Insert number ");

        int number = scanner.nextInt(); // object function nextint is called and the result (output) is stored in variable int number


        if ((number % 5 == 0) && (number % 3 == 0)) {// % is a module that shows remainer of division.if it is 0 it means this is divided by 5

            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else
            System.out.println(number);

    }
    }
