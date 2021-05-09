package alicja.examples.timbuchalka;

import java.util.Scanner;
// read 10 numbers from user and print sum of these numbers
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner("Hola Alicja\n55\n");
        System.out.println(scanner2.hasNextInt());
        System.out.println(scanner2.hasNext());
        String firstLine = scanner2.nextLine();
        System.out.println("First Line=" + firstLine);
        System.out.println(scanner2.hasNextInt());
        int value = scanner2.nextInt();
        System.out.println(value);

        Scanner scanner= new Scanner(System.in);
        int sum=0;
        boolean hasInt;
        int counter=1;
        int number=0;

        while(counter<=10){
            System.out.println("Enter number #"+counter);
            hasInt=scanner.hasNextInt();

            if(!hasInt){
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
            else{
                number=scanner.nextInt();
                scanner.nextLine();
                sum=sum+number;
                counter++;
            }
        }

        scanner.close();
    }



}
