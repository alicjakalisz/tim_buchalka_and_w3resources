package alicja.examples.timbuchalka;

import java.util.Scanner;

public class InputCalculator {

    //Write a method called inPrintSumAndAverage that does not have any parameters.
    //The method should not return any putTheing (void) and it needs to keep reading int numbers from the keyboard.
    //When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
    //XX represents the sum of all entered numbers of type int.
    //YY represents the calculated average of all numbers of type long.
    //EXAMPLES OF INPUT/OUTPUT:
    //EXAMPLE 1:
    //INPUT:
    //1
    //2
    //3
    //4
    //5
    //a
    //OUTPUT
    //SUM = 15 AVG = 3
    //EXAMPLE 2:
    //INPUT:
    //hello
    //OUTPUT:
    //SUM = 0 AVG = 0

    public static void main(String[] args) {

        inPrintSumAndAverage();
    }
    public static void inPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        long average=0;
        int counter=0;
        int number=0;
        boolean isInt;
        while(true){
            System.out.println("Enter number");
            isInt=scanner.hasNextInt();
            if(isInt){
                number=scanner.nextInt();
                scanner.nextLine();
                sum=sum+number;

                counter++;
            }
            else {
                if(counter!=0){
                    average=Math.round(sum/counter);
                }
                System.out.println("SUM= "+sum+" AVG = "+average);
                break;
            }


        }
        scanner.close();
    }
}
