package alicja.examples.book.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {

    public static void main(String[] args) {

        String[] names;
        names = new String[5];

        // String [] names = new String [5];

        //initiliazing an array

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        days[6] ="Sunday2"; // element of index 6 overriden to Sunday2
        System.out.println(Arrays.toString(days));

        String[] days2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // LOOP THAT CREATES AN ARRAY OF 100 NUMBERS FROM 1 TO 100

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println();
        // program that takes number of players from the user and then players'names from the user.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of players: ");
        int numberOfPlayers = scanner.nextInt();
        String[] players = new String[numberOfPlayers];

        Scanner scanner2 = new Scanner(System.in);
        for (int j = 0; j < players.length; j++) {
            System.out.println("Give a player name");
            String nameofPlayer = scanner2.nextLine();
            players[j] = nameofPlayer;
            System.out.println(players[j]);
        }


    }
}
