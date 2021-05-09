package alicja.examples.w3examples.methods;

public class ValidPassworrd {

    //Write a Java method to check whether a string is a valid password. Go to the editor
    //Password rules:
    //A password must have at least ten characters.
    //A password consists of only letters and digits.
    //A password must contain at least two digits.
    public static void main(String[] args) {


    }

    public static boolean isValid(String password){
        //If password has less than 10 characters
        if(password.length()<=10){
            return false;
        }
        else { // When password has more than 10 characters
           int counter=0;
            //Iterate over all the characters
            for (int i = 0; i <password.length() ; i++) {

                char a= password.charAt(i);
                //If a character is not valid, we return false
                if(!Character.isLetterOrDigit(a)){
                    return false;
                }
                if(Character.isDigit(a)){
                    counter=counter+1;
                }

            }

            if(counter<2){
                return false;
            }

        }
        return true;
    }


}
