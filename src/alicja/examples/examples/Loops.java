package alicja.examples.examples;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args){

        //**********LOOPS************* FOR LOOP better if we know exact number of loops, WHILE LOOP if user will be running program until he decide to quit - number of loops unknown

        //WE want to repeat Hello World 5 times on the terminal without repetition of code

        //**********************FOR LOOP

        for(int i = 0; i<5; i++) { // 3 steps inside of the parenthesis , variable that stores number of loops (LOOP COUNTER) with inital 0 for the start, expression - how many loops allowed and increment)
        // in parenthesis you can put the print for example, contruction similar to IF statement
            System.out.println("Hello World" + i);

        }// how it works: first java loook at the value of I, then goes and evaluates the condition (checks if its ture) and if this is true then do I++

        // REVERSED LOOP variable initialised not from 0 loops but from the highest number of loops which we want to run
        for(int k = 5; k>0; --k){
            System.out.println("Hello World" + k);
        }


        //***********************WHILE LOOP SYNTAX
        /*
        int i = 0;
        while(i > 0) {
        system.out.println("Hello World " + i);
        i--;
         */


        // loop - user input endless until he writes "quit" - while loop with strings
        Scanner scanner = new Scanner(System.in);//we will need it later, it was moved here


        String input = "";// this is not integer so intial value of string /input is nothing so ""
        while (!input.equals("quit")) {// we cannot put input=="quit" as we cannot use operators between references but we have method of class string "equals",
                                    //but we want NOT equal so need to put ! a the beginning of expression , so if input is not quit, the loop goes on so we will be
                                    // asking user to keep inputting something, in the curly braces you have code to be executed if expression is validated

            System.out.println("Input");// asking user for input
           // Scanner scanner = new Scanner(System.in); initially this scanner was created here but it was moved outside loops as we would have created many objects and we need one to use its methods
            input= scanner.next().toLowerCase();//we will store the result of this functions so users input changed to lower case will be stored into input variable that we have created
            System.out.println(input);
    }



        // DO WHILE LOOP - similar to WHILE LOOP but neeeds to be executed at least once


        do {
            System.out.println("Input");
            input= scanner.next().toLowerCase();
            System.out.println(input);

        }while(!input.equals("quit"));



}}

