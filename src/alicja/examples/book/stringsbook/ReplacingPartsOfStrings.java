package alicja.examples.book.stringsbook;

import java.util.Scanner;

public class ReplacingPartsOfStrings {

    // replaceFirst or replaceAll methods

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj string: ");
        String input=scanner.nextLine();
        input=input.replaceAll("cat", "dog"); // jak w Excelu replaces all occurences of cat with dog
        System.out.println(input);
        System.out.println("Podaj string: ");
        input=scanner.nextLine();
        System.out.println(input);
        input=input.replace('a','b');
        System.out.println(input);

    }
}
