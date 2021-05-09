package alicja.examples.w3examples.conditionStatements;

import java.util.Scanner;

public class SmallerAndLargeNumber {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Give number: ");
        float number=scanner.nextFloat();
        AssesNumber(number);






    }

    public static void AssesNumber(float number){

        if(number==0){
            System.out.println("The number is zero");

        }else if(number>100000){
            System.out.println("Positive large number");

        }else if(number<=100000 && number>=2){
            System.out.println("Positive number");
        }else if(number>0 && number<2){
            System.out.println("Positive small number");
        }else
            System.out.println("Negative number");




    }


}
