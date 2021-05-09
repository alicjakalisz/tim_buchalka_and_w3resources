package alicja.examples.timbuchalka;

import java.util.Scanner;

public class SCanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your birthdate:");
        boolean hasInt=scanner.hasNextInt();

        if(hasInt){

            int birthdate=scanner.nextInt();

            scanner.nextLine();// to handle enter key word
            System.out.println("enter you name:");
            String name=scanner.nextLine();

            int age=2018-birthdate;
            if(age>100 || age<0){
                System.out.println("Invalid DateOfBirth");
            }else
                System.out.println("Your name is "+ name+" and your age is "+age);
        }else
            System.out.println("Unable to parse year of birth");

        scanner.close();

    }
}
