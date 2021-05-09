package alicja.examples.timbuchalka;

public class SharedDigits {
    //Write a method named hasSharedDigit with two parameters of type int.
    //Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
    //The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
    //EXAMPLE INPUT/OUTPUT:
    //* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both number

    public static void main(String[] args) {
        boolean hasShareDigit=hasShareDigit(14,64);
        System.out.println(hasShareDigit);

    }
    public static boolean hasShareDigit(int n1, int n2){
        if((n1<10)|| (n1>99)){
            return false;
        }
        if((n2<10)|| (n2>99)){
            return false;
        }
        String s1=n1+"";
        String s2=n2+"";

        for (int i = 0; i <s1.length() ; i++) {
            for (int j = 0; j <s2.length() ; j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                    return true;
                }

            }

        }
        return false;
    }
}
