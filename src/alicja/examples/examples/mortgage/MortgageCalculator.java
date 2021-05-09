package alicja.examples.examples.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main (String[] args){


        //Principal= 100000
        //annual insterest rate: 3.92
        //PEriod (Years): 30
        // Mortgage:??

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT=100;
        Scanner scanner = new Scanner(System.in);// object created of Class Scanner
        System.out.println("Principal: "); // command on terminal
        int principal= scanner.nextInt(); // , we are adding function to scanner object and then storing the outcome of function to the variable

        System.out.println("Annual interest: ");
        float annualInterest= scanner.nextFloat(); //here we are using the same object which we created above but with different function (it will return user intput in string form
       float monthlyInterest= annualInterest/ PERCENT / MONTHS_IN_YEAR;
        System.out.println("Period in years: ");
        byte years =scanner.nextByte();
        int numberOfPayment= years * MONTHS_IN_YEAR;
        double mortgage = principal * ((monthlyInterest * Math.pow((1 + monthlyInterest),numberOfPayment))/ (Math.pow((1 + monthlyInterest),numberOfPayment)-1));
        String mortageInpercentage = NumberFormat.getPercentInstance().format(mortgage);
        System.out.println(mortageInpercentage);








        // COMPARISON OPERATORS
        //LOGICAL OPERATORS


        //SOLUTION *********************



    }
}
