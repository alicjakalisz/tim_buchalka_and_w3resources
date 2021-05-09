package alicja.examples.book.exceptions;

import java.util.Scanner;

public class C {

    public int getNumber(){
        System.out.print("Introduce a number: ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("C get number " + number);
        return number;
    }
}
