package alicja.examples.w3examples.methods;

public class CountWords {
    //Write a Java method to count all words in a string. Go to the editor
    //Test Data:
    //Input the string: The quick brown fox jumps over the lazy dog.
    //Expected Output:
    //
    //Number of words in the string: 9

    public static void main(String[] args) {

    String text=" David is from Spain";
    int numberOfWords=countWords(text);
        System.out.println("Number of words in a string: "+ "\\" +text+"\\" + "is "+numberOfWords );


    }

    public static int countWords (String string){
        int number=0;
        String[] array=string.trim().split("\\s+");
        number=array.length;


        return number;
    }
}
