package alicja.examples.w3examples.methods;

public class SumOfDigits {
//Write a Java method to compute the sum of the digits in an integer. Go to the editor
//Test Data:
//Input an integer: 25
//Expected Output:
//
//The sum is 7
    public static void main(String[] args) {


    }
// For example 975 int needs to be converted to string "975", then you run for loop with chartat(i) on this string. CharAt gives you sign so to avoid receiving ASCII code value, you need to then convert i to string
    // and from string to int.
    // int -->string--> split into char--> string--> int.
    public static int sumOfDigits(int number){
        int sum=0;

        String convertedNumber=""+number;
        for (int i = 0; i <convertedNumber.length() ; i++) {
            char a;
            String b;
            int digit;
            a=convertedNumber.charAt(i);
            b=""+a;
            digit=Integer.parseInt(b);
            sum=sum+digit;
            //sum += Integer.parseInt(convertedNumber.charAt(i)+"");

        }
        return sum;
    }
}
