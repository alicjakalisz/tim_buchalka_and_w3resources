package alicja.examples.timbuchalka;

public class GetEvenDigitSum {

    //Write a method named getEvenDigitSum with one parameter of type int called number.
    //The method should return the sum of the even digits within the number.
    //If the number is negative, the method should return -1 to indicate an invalid value.
    //EXAMPLE INPUT/OUTPUT:
    //* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
    public static void main(String[] args) {
        int sum=getEvenDigitSum(21234);
        System.out.println(sum);
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sumOfEvenDigits=0;
        String numberString=number+"";
        for (int i = 0; i <numberString.length() ; i++) {
            int a=Integer.parseInt(Character.toString(numberString.charAt(i)));
            if(a%2==0){
               sumOfEvenDigits=sumOfEvenDigits+a;
            }
        }
        return sumOfEvenDigits;
    }
}
