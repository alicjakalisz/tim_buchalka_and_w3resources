package alicja.examples.w3examples.methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VowelsInString {

    //Write a Java method to count all vowels in a string. Go to the editor
    //Test Data:
    //Input the string: w3resource
    //Expected Output:
    //
    //Number of  Vowels in the string: 4


    public static void main(String[] args) {
        String string="David Virgil Naranjo";
        int numerVowels=countVowels(string);
        System.out.println("Number of Vowels in the string " + string + " is "+ numerVowels);
        int numberVowels2=countVowelsV2(string);
        System.out.println("Number of Vowels in the String " + string + " is " + numberVowels2);

    }

    public static int countVowels (String text){
        int numerVowels=0;

        for (int i = 0; i <text.length() ; i++) {
            if((text.charAt(i)=='a') || (text.charAt(i)=='e') ||(text.charAt(i)=='i') ||(text.charAt(i)=='o') ||(text.charAt(i)=='u') ||(text.charAt(i)=='y')){

                numerVowels=numerVowels+1;
            }
        }

        return numerVowels;
    }

    public static boolean isVowel(char a){
        if((a=='a')|| (a=='e')|| (a=='i')|| (a=='o')|| (a=='u')|| (a=='y')){
            return true;
        }
        return false;
    }
    public static int countVowelsV2 (String text){
        int numerVowels=0;
        for (int i = 0; i <text.length() ; i++) {
            if(isVowel(text.charAt(i))){
                numerVowels=++numerVowels;
            }

        }
        return numerVowels;
    }

}

