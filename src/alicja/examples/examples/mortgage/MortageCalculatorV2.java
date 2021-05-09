package alicja.examples.examples.mortgage;

import java.util.Scanner;

public class MortageCalculatorV2 {

    final static byte MONTHS_IN_YEAR =12;
    final static byte PERCENT=100;

    public static void main(String[] args){

        int deposit = (int) readNumber("Introduce the deposit: ", 1000, 100000);
        float annualInterestRate = (float)readNumber("Introduce the Annual Interest: ", 1,30);
        float monthlyInterestRate=annualInterestRate/MONTHS_IN_YEAR;
        byte years =(byte) readNumber("Introduce the years: ", 5,40);

        double mortgateValue = calculateMortage(deposit, monthlyInterestRate, years);

        System.out.println("The mortgage for " + deposit + " with interest rate of " + monthlyInterestRate + " during " + years + " is " + mortgateValue);

    }
// **********************************************GENERIC METHOD in OTHER method for using in the main method**********************************
    public static double readNumber(String prompt, int min, int max){// you set it up as type double as it is easy to cast it to float, int and byte.
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(prompt);// instead of hardcoding, that goes to parameter,
            double number= scanner.nextDouble();// number as can be deposit, interest rate, or years, that goes to parameter
            if(number >= min && number < max){// number previously hardcoded now goes to parameters
                return number;
            }
            else{
                System.out.println("Valid values are between " + min+ " and "+ max);
            }
        }



    }


   /* public static int getDeposit() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Introduce the deposit: ");
            int deposit= scanner.nextInt();
            if(deposit >= 1000 && deposit < 100000){
                return deposit;
            }
            else{
                System.out.println("Valid values are between 1000 and 100000");
            }
        }

    }




    public static float getInterestRate() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Introduce the Annual Interest: ");// asking user for input
            float annualInterest= scanner.nextFloat(); //using scanner.nextFloat method and storing result in annualInterst
            if(annualInterest >=1 && annualInterest <= 30){// expression to meet, if true you calculate based on thsi figure monthly interest and return monthly Interest if you call this method
                float monthlyInterest = annualInterest/PERCENT;
                return monthlyInterest;
            }
            else{// if expression is not meet it prints this message and goes back to the beginnig of the loop unit it receives satifactory message
                System.out.println("Valid values are between 1 and 30");
            }
        }

    }

    public static byte getYears() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Number of years: ");
            byte years= scanner.nextByte();
            if(years >= 5 && years <= 40){
                return years;// returns value of this variable
            }
            else{
                System.out.println("Valid values are between 5 and 40");
            }
        }


    }*/

    public static double calculateMortage(int principal, float annualInterest, byte years){

        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest /PERCENT/MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(monthlyInterest, 1/numberOfPayments));
        // not the real formula!!

        return mortgage;  // now you can go to main method and call method : so variable -> double result= calculateMortage(principal, annualInterset, years) - if you want to print SOUT(result)
    }
}
