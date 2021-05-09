package alicja.examples.w3examples.conditionStatements;

import java.util.Scanner;

public class printTheGreatestnumber {


    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Numer 1: ");
        int numer1=scanner.nextInt();
        System.out.println("Numer 2: ");
        int numer2=scanner.nextInt();
        System.out.println("Numer 3: ");
        int numer3=scanner.nextInt();

        int theGreatestN=getTheGreatestNumber(numer1,numer2,numer3);

    }


    public static int getTheGreatestNumber(int n1, int n2, int n3) {

        if (n1 > n2 && n1 > n3){
            System.out.println("The greatest number is: " + n1);
            return n1;

        } else if (n3 > n2 && n3 > n1) {
            System.out.println("The greatest number is: " + n3);
            return n3;

        } else if (n2 > n1 && n2 > n3)
            System.out.println("The greatest number is: " + n2);
        return n2;

    }
    }

