package alicja.examples.book.stringsbook;

public class StringsBook {

    public static void main(String[] args) {


        String line1= "Oh what a beautiful morning!";
        System.out.println(line1.length()); // 28 how many characters including white spaces between
        String line2= "Oh\f what a \n beauti\rful\t morning\b!";
        System.out.println(line2);

        String line3= "Oh \\what \" a beautiful\" morning!";
        System.out.println(line3);
        String line4= "Oh what a beautiful \rmorning!";
        System.out.println(line4);

        //strings to integers

        String s= "56";
        int i=Integer.parseInt(s);
        System.out.println(i+85);//141
        System.out.println(s+85);//5685


        //You cant change the string after you have created it. But you can use the methods of string class to create new strings that
        //are variations of the original string.


        //STRING MODIFICATIONS:

        String a1= "Oompa Loompa";
        String a2= a1.toLowerCase();
        System.out.println(a2);
        System.out.println(a2.toUpperCase());
        String x="Hola";
        x="Czesc"; // variable x has been assigned to another string now so it is poining to Czesc string in the memory .
        // Hola does not have a reference  now and Garbage collect will find it remove it from the memory as not in use anymore.
        System.out.println(x);

        String string = " Oompa Loompa  ";
        System.out.println(string.trim());// removes white spaces at front and back

        string.trim(); // this statement has no effect on the string as it has not been assigned to any variable to it will be taken by the garbage collector
        string= string.trim(); // now trimmed string is assigned to the variable so this will be referenced in the memroy and garbagge collector will remove initial string value " Oompa Loompa "






    }
}
