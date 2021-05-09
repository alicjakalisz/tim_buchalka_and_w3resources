package alicja.examples.timbuchalka;

import oop2.A;

public class SwitchStatement {
    public static void main(String[] args) {


        char a ='A';
        switch (a){
            case 'A':
                System.out.println("The letter is A");
                break;
            case 'B':
                System.out.println("The letter is B");
                break;
            case 'C':
                System.out.println("The letter is C");
                break;
            case 'D':
                System.out.println("The letter is D");
                break;
            default:
                System.out.println("Nothing found");
                break;
        }
    }
}
