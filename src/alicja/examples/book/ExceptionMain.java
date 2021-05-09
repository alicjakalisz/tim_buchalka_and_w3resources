package alicja.examples.book;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {

        boolean correct=false;
        while(!correct){
            System.out.println("Introducer a number: ");
            try{
                readNumber();
                correct=true;
            }
            catch (Exception e){
                System.out.println("Introduce a numeric value please");
            }


        }
    }

    public static int readNumber() throws NumberFormatException{
        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        int number = Integer.parseInt(input);
        return number;
    }
}
