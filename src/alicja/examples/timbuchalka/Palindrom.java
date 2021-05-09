package alicja.examples.timbuchalka;

public class Palindrom {

    //The method needs to return a boolean.
    //It should return true if the number is a palindrome number otherwise it should return false.
    //Check the tips below for more info about palindromes.
    //Example Input/Output
    //isPalindrome(-1221); → should return true
    //isPalindrome(707); → should return true
    // isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

    //Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
    public static void main(String[] args) {

        isPalindrome(1221);
    }

    public static boolean isPalindromeString(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != (word.charAt(word.length() - i - 1))) {
                System.out.println(word + " is not a palindrome");
                return false;
            }
        }
        System.out.println(word + " is a palindrome");
        return true;
    }

    public static boolean isPalindrome(int number) {
        String string = number + "";
        if(number<0){
            string=string.substring(1);
        }

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                System.out.println("It is not a palindrome");
                return false;
            }

        }
        System.out.println("is palindrome");
        return true;

    }

}
