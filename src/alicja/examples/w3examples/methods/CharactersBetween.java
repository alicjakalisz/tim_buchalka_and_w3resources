package alicja.examples.w3examples.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharactersBetween {
    //9. Write a Java method to print characters between two characters (i.e. A to P ). Go to the editor
    //Note: Prints 20 characters per line
    //
    //Expected Output:
    //
    //( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
    //< = > ? @ A B C D E F G H I J K L M N O
    //P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
    //d e f g h i j k l m n o p q r s t u v w
    //x y z

    public static void main(String[] args) {


        String characters="( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \\ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z";
        printCharacters(characters,'A','R');
        System.out.println();
        printCharactersV2('A','r');
    }

    public static void printCharacters(String string, char a, char b){
        System.out.println(string.substring(string.indexOf(a),string.indexOf(b)+1));


    }
    public static void printCharactersV2(char a, char b){
        int counter=0;
        int beginning=a; // converting char to ASCII integer value
        int finish=b;// converting char to ASCII integer value
        for (int i = a; i <b; i++) { // you run it from a value to b value
            counter=counter+1;
            System.out.print((char)i); // converintg i into character
            if(counter%20==0){
                System.out.println();

            }

        }

    }
}
