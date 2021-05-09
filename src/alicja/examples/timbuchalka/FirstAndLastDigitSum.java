package alicja.examples.timbuchalka;

public class FirstAndLastDigitSum {

    //Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    //The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
    //If the number is negative then the method needs to return -1 to indicate an invalid value.
    //Example input/output
//sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
    public static void main(String[] args) {
        int sum=sumFirstAndLastDigit(1234);
        System.out.println(sum);

    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            System.out.println("Not a valid number");
        }
        String convertedNumber=number+"";
        char a= convertedNumber.charAt(0);
        char b=convertedNumber.charAt(convertedNumber.length()-1);
        int firstDigit=Integer.parseInt(Character.toString(a));
        int lastDigit=Integer.parseInt(Character.toString(b));
        int sum=firstDigit+lastDigit;
        return sum;
    }

}
