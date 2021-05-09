package alicja.examples.w3examples.conditionStatements;

import java.util.Scanner;

public class DisplayNameofWeekday {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number: ");
        int number=scanner.nextInt();
        System.out.println(displayNameofWeek(number));
    }


    public static String displayNameofWeek(int number){

        if(number==1){
           return "Monday";
        }else if(number==2){
            return "Tuesday";
        }else if(number==3){
            return "Wednesday";
        }else if(number==4){
            return"Thursday";
        }else if(number==5){
            return"Friday";
        }else if(number==6){
            return "Saturday";
        }else if(number==7) {
            return "Sunday";
        }else return "error";
    }
}
