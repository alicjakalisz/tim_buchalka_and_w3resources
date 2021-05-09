package alicja.examples.examples.mortgage;

import java.util.Scanner;

public class WhileLoopMortage {

    public static void main(String[] args) {


        int deposit = 0;
        int annualInterestrate = 0;
        Scanner scanner = new Scanner(System.in);
        final int PERCENT = 100;
        float monthlyInterest = 0;

        while (true) {             // infinite loop, and in culry braces code with if statement and break if correct.
            System.out.println("Deposit: ");
            deposit = scanner.nextInt();
            if (deposit >= 1000 && deposit <= 1000000) {
                break;
            }                                // jezeli deposyt spelnia warunki to koniec petli a jak nie to bedzie pytac i pytac, czyli uzgadniamy jaki jest deposyt.

            System.out.println("Enter a value between 1000 and 1000000"); //otherwise loop continues with this message and startts again:  Depost1: .


            while (true) {
                System.out.println("Annual Interest Rate ");
                annualInterestrate = scanner.nextInt();
                if (annualInterestrate > 1 && annualInterestrate < 30) {
                    monthlyInterest = annualInterestrate / PERCENT;
                    break;
                }

                System.out.println("Your annual Interest must be between 1 and 30");


            }

        }
    }}
