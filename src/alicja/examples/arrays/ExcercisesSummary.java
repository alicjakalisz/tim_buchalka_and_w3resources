package alicja.examples.arrays;

import java.util.HashMap;
import java.util.Map;

public class ExcercisesSummary {

    public static void main(String[] args) {


    }


    public static Map<String, Integer> getCountOfWords(String text) {
        Map<String, Integer> countOfWords = new HashMap<>(); // empty Map no keys and no values;
        String[] splitted = text.split(" ");// string converted into array so we can run a loop
        int initialValueCount = 1;
        for (String word : splitted) {
            if (!countOfWords.containsKey(word)) {// if map does not contain this key, then we need to assign this key, together with value below
                countOfWords.put(word, initialValueCount);// we are always assigning to map the key and the value! , method "put" takes 2 parameteres
            } else {//if the map already has this key in it, then we increment value of it from 1 to 2 as second time appears
                Integer currentValueOfWord = countOfWords.get(word);// we are storing current Value of the key "Word" from Map getCountWords, we want to get this value
                countOfWords.put(word, currentValueOfWord + 1);//
            }

        }


        return countOfWords;
    }

    public static void swampCharacters(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = i;// we need to use this temp as i is going to be overwritten by the line below and in the seconf line below we need to use i value before changing it.
            array[0] = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[temp];
        }
    }

    public static boolean isPAlindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
