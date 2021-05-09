package alicja.examples.stringsrandom;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str1 = "w3resource";
        System.out.println("The given string is: " + str1);
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    private static String removeDuplicateChars(String sourceStr) {
        char[] arr1 = sourceStr.toCharArray();// putting all of the characters of string into array of characters
        String targetStr = "";// creating an empty string at the beginning
        for (char value: arr1) {// loop through the array of chars
            if (targetStr.indexOf(value) == -1) {// if
                targetStr += value;
            }
        }
        return targetStr;
    }
}
