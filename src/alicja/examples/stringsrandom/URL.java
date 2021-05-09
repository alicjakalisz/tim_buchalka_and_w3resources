package alicja.examples.stringsrandom;

import java.util.Arrays;

public class URL {

    // input: xyz://abc.pl/sda
    // output:  //protocol = xyz
               //domain= abc.pl
               //reszta= //sda......


    public static void main(String[] args) {

        String s1= "hjhjhj://abc.pl/sda";
        String[] split1=s1.split("://"); // xyz and abc.pl/sda
        if(s1.length()>2 || s1.length()<2){
            System.out.println("Invalid URL");
        }

        String protocol=split1[0];
        System.out.println(protocol);
        String reszta=split1[1];
        String[] split2=reszta.split("/"); //abc.pl/sda --> abc.pl and sda
        for (String s: split2){
            System.out.println(s);
        }
        String domain=split2[0];
        String end=split2[1];

        System.out.println("String: "+s1+" consists of: "+protocol+" "+domain+" "+end);

        String str3="This is a sample string";
        char[] array2 = {'$','$','$','$','$','$','$','$','$','$','$','$'};
        str3.getChars(2,7, array2,3);
        System.out.println(Arrays.toString(array2));

        byte[] array=str3.getBytes();

        String string="This is a string";
        String new_string=string.replace('T','P');
        System.out.println(string);
        System.out.println(new_string);
        string="Another string";
        System.out.println(string);
        System.out.println(new_string);

    }
}
