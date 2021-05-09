package alicja.examples.w3examples.strings;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[]args){
        String text = "david loves alicja and alicja loves very much david";
        System.out.println(countWords(text));


    }

    public static Map<String, Integer> countWords(String text){
        Map<String, Integer> words=new HashMap<>();// creating empty Map WORDS
        Integer initialValue =1;// initial value which will be assgiedn to every key (word)
        String[] splitted=text.split(" ");// turning String into array of words of this string// doesnt modify String text, it returns new array
        for(String word:splitted){//running loop of this array
            if(!words.containsKey(word)){// if WORDS MAP do not contain this key from Array loop (made frmo the string)
                //In this case this is the first time that the word appears, and then we need to in(key)in the map using array loop (using method put- it adds a new item to the map
                //In this case this is the first time that the word appears, and then we need to initialize the counter with the value 1
                words.put(word, initialValue);// so key is assigned with intial value 1

            }
            else{
                //This is the case when the word is already existing in the map.
                //So what we have to do is to update the value of the counter of the map adding one
                //For example if we iterate with the word "paco" and the counter of paco is already 2, then we need to add one to the counter, so it becames 3
                Integer currentWordCount = words.get(word); //this line gets the current count for the word that we are iterating.(return current VALUE for key WORD
                words.put(word, currentWordCount + 1); //updating the existing value for the word adding one.
            }
        }
        return words;
    }
}
