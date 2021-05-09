package alicja.examples.w3examples;

import java.util.Scanner;

public class W3Strings {

    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert the string: ");
        String text=scanner.nextLine();
        System.out.println("Which position in the string you want the unicode for?");
        int positon=scanner.nextInt();
        int result=getUnicode(text,positon);

        System.out.println("String: "+ text+ " Position: "+positon+ " and Unicode: "+result);

        String word="0123456789";
        int result1=getCodepoint(word,2,7);
        System.out.println(result1);



        // compare two strings:

        String str1= "PHP Exercises and ";
        String str2="Python Exercises";
        int result4=str1.compareTo(str2);
        System.out.println("result: "+result4);
        if(result>0){
            System.out.println(str1 +" is bigger than" + str2);
        }else if(result==0){
            System.out.println(str1+ " is equal to"+ str2);
        }else if(result<0){
            System.out.println(str1 + " is smaller than "+ str2);
        }
        //concatenate two strings
        String concatenated=str1.concat(str2);
        System.out.println(concatenated);

        // contain function in String

        String string1= "PHP Excercises and Python Exercises";
        System.out.println("Which characters are we looking for?");
        String lookedString=scanner.nextLine();

        boolean contain=string1.contains(lookedString);
        System.out.println(contain);


    }

    public static int getUnicode(String text, int position){
        int result=text.charAt(position);
        return result;
    }

    public static int getCodepoint(String text, int beginIndex1, int endIndex2){
        int result=text.codePointCount(beginIndex1,endIndex2);
        return result;
    }
}
