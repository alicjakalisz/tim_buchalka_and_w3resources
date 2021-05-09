package alicja.examples.timbuchalka.interfacechallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce the values of Player: ");
        ArrayList<String> values= readValues();
        Player player= new Player();// created Player with attribues set at values null/0
        player.doImport(values);
        save(player);

    }
    public static boolean save(ISaveable object){
        ArrayList<String> list=object.doExport();
        //normally next step is to iterate through this list and export value into some file.
        System.out.println("Saving object to the file: "+object);
        return false;
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
