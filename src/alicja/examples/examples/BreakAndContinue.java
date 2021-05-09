package alicja.examples.examples;

import java.util.Scanner;

public class BreakAndContinue {


    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input");
            input= scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;// this 2 lines  added, if input is "quit" then out of the loop and the end
            System.out.println(input);
        }

        //***************FOR EACH LOOP
        // use of for loop with ARRAYS
        String[] fruits = {"Apple", "Magno", "Orange"}; ///  witn integer that would ne Int [] numbers = {1,2, 3, 4, 5} ; to read it sout (numbers.length) -ile ich jest or numbers[2]

        for(int i= 0; i< fruits.length;i++){
            System.out.println(fruits[i]);
        }

        //use of for each loop
        for (String fruit : fruits)
            System.out.println(fruit);


    }
}
