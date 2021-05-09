package alicja.examples.w3examples.strings;

import java.util.Arrays;

public class StringsMain {

// String are alicja.examples.arrays of char
    public static void main(String [] args){
        String text="Java Excercises!";
        int position=7;
        char result=getCharacer(text,position);
        System.out.println("The character at position "+ position + " is "+ result);

        System.out.println(getCharacterUniCode(text,position));
        System.out.println("David".compareTo("Alicja"));
        System.out.println("Alicja".compareTo("David"));// comparing two strings and will return 0 if equals and if minus or plus depending which one is greater lexicographically
        System.out.println("   Enrique Bunbury  ".trim());// removes the spaces at the beginning and at the end but not between words in a string
        System.out.println("Lucyna Kalisz".concat(" ").concat("Grzegorz"));
        System.out.println("Sajnoczka".endsWith("czka"));//true or false
        System.out.println("Sajnoczka is my my friend".indexOf("my")); // will give me index in the phrase where  first "my" starts
        System.out.println("Sajnoczka is my my friend".lastIndexOf("my"));//will give me index in the phrase where  last "my" starts
        System.out.println("We are living with Loco Loco".substring(7));//it will extract string from the phrase starting from index position 7
        System.out.println("We are living with Loco Loco".substring(7,10));//will extract from index position 7 to 10 only
        String s="Malwina jest glupia";
        String[] words=s.split(" "); // string was converted into array of strings using charactered passsed: " " as a separator
        System.out.println(Arrays.toString(words));
        System.out.println(isPalindrome("Dupa"));//false
        System.out.println(isPalindrome("Abba"));//false
        System.out.println(isPalindrome("abba"));//true


    }


    public static char getCharacer(String string,int position){
        char result=string.charAt(position);
        return result;
    }


    public static int getCharacterUniCode(String string, int position){
        int result=(int)string.charAt(position);
        return result;
    }

    public static boolean isPalindrome(String string){
        for(int i=0; i<string.length()/2;i++){
            if(string.charAt(i)!=string.charAt(string.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}
