package alicja.examples.stringsrandom;

import java.sql.SQLOutput;

public class Excercises {
    //Write a Java program to get the character (Unicode code point) at the given index within the String
    public static void main(String[] args) {
        String s1="Milosc w czasach zarazy";
        char a= s1.charAt(2);
        System.out.println(a);
        int unicode= a;
        System.out.println("Unicode for char "+a+" is "+unicode);
        //OR
        int a2=s1.codePointAt(2);
        System.out.println(s1.codePointAt(2));



        String s2="Milosc w czasach zarazy";
        s2="dupa";// it is pointing now to dupa and Milosc... to garbage collector
        System.out.println(s2);
        String s3=new String();
        s3="David";
        String s4=new String();
        s4="David";
        //string optimsation


        //Write a Java program to get the character (Unicode code point) before the specified index within the String
        String s5="w3resource.com";
        int index=5;
        int unicode2 =s5.codePointAt(index-1);
        int unicode2a=s5.codePointBefore(index);
        System.out.println(unicode2);
        System.out.println(unicode2a);

        //Write a java program to count a number of Unicode code points in the specified text range of a String

        String s6="w3resource.com";
        int sum=0;
        char c;
        int count=0;
        int indexStart=1;
        int indexEnd=10;
        if((indexEnd<0) || (indexEnd>s6.length()-1) || indexStart<0 || indexStart>indexEnd){
            System.out.println("Invalid index range");
        }
        String s7=s6.substring(indexStart,indexEnd-1);
        for (int i = 0; i <s7.length() ; i++) {
            c=s6.charAt(i);
            int unicode3=c;
            count=count+1;
            sum=sum+unicode3;
        }
        System.out.println("Count of a number of Unicode code points is: "+count);
        System.out.println("Sum of unicode codes is: "+sum);





    }



}