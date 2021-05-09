package alicja.examples.w3examples.methods;

public class MiddleCharacter {

    //3. Write a Java method to display the middle character of a string. Go to the editor
    //Note: a) If the length of the string is odd there will be two middle characters.
    //b) If the length of the string is even there will be one middle character.
    //Test Data:
    //Input a string: 350
    //Expected Output:
    //
    //
    //The middle character in the string: 5



    public static void main(String[] args) {
        String gato="gato";
        String gatos="gatos";

        System.out.println(getMiddleChar(gato));
        System.out.println(getMiddleChar(gatos));
    }

    public static String getMiddleChar(String text){

       if(text.length()%2==0){

           return text.charAt(text.length()/2-1) +""+ text.charAt(text.length()/2);
       }


        return text.charAt(text.length()/2)+"";

    }
}
