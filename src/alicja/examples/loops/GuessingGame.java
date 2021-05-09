package alicja.examples.loops;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {


        System.out.println("Let's play a guessing game");

        boolean keepPlaying=true;
        Scanner scanner= new Scanner(System.in);
        String yesOrNo;
        while(keepPlaying){
            // we are gonna guess the number
            System.out.println("I am thinking of the number between 1 and 10");
            int number=(int)(Math.random()*(10+1));
            System.out.print("What do you think it is?");
            int userGuess=scanner.nextInt();
            while(userGuess<0 || userGuess>10){
                System.out.print(" I said between 1 and 10. Try again: ");
                userGuess=scanner.nextInt(); // asking again (if the answer was out of scope)
            }
            if(userGuess==number){
                System.out.println("You are right");
            }
            else{
                System.out.println("You are wrong! The number was: "+ number);
            }
            //lets ask the user if he wants to play again or not
            yesOrNo="";// yesOno is empty so the condition of the while is true and we can enter the loop
            while(!(yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("N"))){
                System.out.println("Play again? (Y or N)");
                yesOrNo=scanner.next();
            }
            if(yesOrNo.equalsIgnoreCase("Y")){
                keepPlaying=true;
            }
            else{
                keepPlaying=false;
                System.out.println("Thank you for playing");
            }
        }
    }
}
