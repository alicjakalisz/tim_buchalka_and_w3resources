package alicja.examples.w3examples;

import java.util.Scanner;

public class ConditionStatements1 {

    public static void main(String[]args){


        Scanner scanner=new Scanner(System.in);
        System.out.println("Give number: ");

        int numberFromUser=scanner.nextInt();
        boolean result =getNumber(numberFromUser);





        }

    public static boolean getNumber(int number){
        if(number>0){


            boolean result=true;
            System.out.println("Number is positive");
            return result;


        }else {
            boolean result=false;
            System.out.println("Number is negative");
            return result;
        }




    }

}



