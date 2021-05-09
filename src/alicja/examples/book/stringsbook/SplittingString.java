package alicja.examples.book.stringsbook;

import java.util.Scanner;

public class SplittingString {

    public static void main(String[] args) {
        // SPLIT command - splitting strings into separate strings based on chosen deliminator character

        String address= "1500 N. Third Street: Fresno: CA: 93722";
        System.out.println(address);
        // creating String array to put the separated strings in using method split(deliminator)

        String [] parts =address.split(":");
        // now we are printing array with for loop:
        for (int i = 0; i <parts.length ; i++) {
            System.out.println(parts[i]);
        }
        // splitining string into separate WORDS so separate by white spaces (\\s+)

            Scanner scanner = new Scanner(System.in);
            System.out.println(" Give me the sentence: ");
            String input=scanner.nextLine();
        System.out.println(input);
            String[] array =input.split("\\s+");
        System.out.println(array.length);
            for (int j = 0; j <array.length ; j++) {
                System.out.println(array[j]);


            }

    }
}
