package alicja.examples.book.stringsbook;

import java.util.Scanner;

public class ExtractingSubstrings {


    public static void main(String[] args) {
        String a= "Baseball";
        String b= a.substring(2); //seball- wskazuje index od ktorego robi substring , zachowujem w nowej variable aby trzymac oba string w pamieci
        System.out.println(b);
        String c=a.substring(2,5); // seb
        System.out.println(c);

        // program to replace all of the vowels in a string to asterix

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me the string: ");
        String input= scanner.next();
        String output = asterixForVowels(input);

        System.out.println(output);
    }

    public static String asterixForVowels(String text){

        String s = text.toLowerCase();

        for (int i = 0; i <s.length(); i++) {
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')|| (s.charAt(i)=='i')|| (s.charAt(i)=='o')|| (s.charAt(i)=='u')){
                String front=s.substring(0,i);
                String back=s.substring(i+1);
                s=front + "*" + back; // with every loop s string will be overwritten, changed and each subsequent loop will be executed on this changed string
// how does it work for string h h o m m a t t
 //                            0 1 2 3 4 5 6 7   index, loops
                //0: s=hhommatt   nothing changed as index 0 = h is not a vowel
                //1: s=hhommatt
                //2: s=hh*mmatt
                //3: s=hh*mmatt
                //4: s=hh*mmatt
                //5: s=hh*mm*tt
                //5:s=hh*mm*tt
                //6:s=hh*mm*tt
            }

        }
        return s;
    }
}
