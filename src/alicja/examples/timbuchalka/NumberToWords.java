package alicja.examples.timbuchalka;

import java.util.Arrays;

public class NumberToWords {
    //rite a method called numberToWords with one int parameter named number.
//The method should print out the passed number using words for the digits.
//If the number is negative, print "Invalid Value".
//To print the number as words, follow these steps:
//1. Extract the last digit of the given number using the remainder operator.
//2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//3. Remove the last digit from the number.
//4. Repeat Steps 2 through 4 until the number is 0.
//The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.
//The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
//Use the method reverse within the method numberToWords in order to print the words in the correct order.
//Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
//The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
//For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
//Example Input/Output - getDigitCount method
//* getDigitCount(0); should return 1 since there is only 1 digit
    public static void main(String[] args) {
        numberToWords(123);
    }

    public static void numberToWords(int number) { // final object to print out the word digits will be String arrays
        String numberString = number + "";// i need to convert number to string to get index of digits for loop and for the array
        String array[] = new String[numberString.length()];
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        for (int i = 0; i < numberString.length(); i++) {
            int remainder = 0;
            remainder = number % 10;// gives me last digit of the number
            String word = remainder + ""; // last digit conver into string
            switch (word) { // asssign to this string word for the digit
                case "0":
                    word = "Zero";
                    break;
                case "1":
                    word = "One";
                    break;
                case "2":
                    word = "Two";
                    break;
                case "3":
                    word = "Three";
                    break;
                case "4":
                    word = "Four";
                    break;
                case "5":
                    word = "Five";
                    break;
                case "6":
                    word = "Six";
                    break;
                case "7":
                    word = "Seven";
                    break;
                case "8":
                    word = "Eight";
                    break;
                case "9":
                    word = "Nine";
                    break;

            }
            number = (number - remainder) / 10;
            array[i] = word;
        }
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(String[] array){
        for (int i = 0; i <array.length/2 ; i++) {
            String temp=array[0];
            array[0]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
    }
    public static void printArray(String[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
