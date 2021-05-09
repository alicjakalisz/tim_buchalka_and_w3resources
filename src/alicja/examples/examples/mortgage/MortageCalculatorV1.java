package alicja.examples.examples.mortgage;

import java.util.Scanner; // you need to create a mortgage calculator method, you need 3 parameters for it - deposit, years and monthly rate. You need to therefore create
// 4 methods under the main method to get deposit (public static type name() and {return}, years, monhly rate, calculator , first hardcode and call them under the pain method.
// For each of this submethod you need to introduce scanner to
//to get input from user and also introduce while loop (infitnitive) to narrow their options).The loops will go on until the input is acceptable

public class MortageCalculatorV1 {

    final static byte MONTHS_IN_YEAR =12;
    final static byte PERCENT=100;

    public static void main(String[] args){// this is main method
// you need to get values for deposit, interestrate and years so you need to call 3 methods and assign results to the variable to store this data as all methods return values
        int deposit = getDeposit(); // result of getDesit method stored in variable
        float interestRate = getInterestRate(); // result of getInretest method stored in varibale
        byte years = getYears();// result of getinterest method stored in varibale
// you have values needed to use calculator formula so you can call this method, also assign the result to the variable.

        double mortgateValue = calculateMortage(deposit, interestRate, years);

        System.out.println("The mortgage for " + deposit + " with interest rate of " + interestRate + " during " + years + " is " + mortgateValue);

    }


    public static int getDeposit() {
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


    }

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
