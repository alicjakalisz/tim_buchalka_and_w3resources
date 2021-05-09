package alicja.examples.book.stringsbook;

import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Give String");
        String input = scanner.next();
        CountingVowels o =  new CountingVowels();
        int numberVowels= o.countVowels(input);
        System.out.println("Number of vowels in string: " + input+ " is: " + numberVowels);
    }

    public int countVowels(String text){
        String lowerCase=text.toLowerCase();
        int countVowels=0;
        for (int i = 0; i <lowerCase.length(); i++) {
            switch(lowerCase.charAt(i)){
                case 'a':
                    countVowels=countVowels+1;
                    break;
                case 'e':
                    countVowels=countVowels+1;
                    break;
                case 'i':
                    countVowels=countVowels+1;
                    break;
                case 'o':
                    countVowels=countVowels+1;
                    break;
                case 'u':
                    countVowels=countVowels+1;
                    break;
                default:
                    break;

            }

        }
        return countVowels;
    }

}
