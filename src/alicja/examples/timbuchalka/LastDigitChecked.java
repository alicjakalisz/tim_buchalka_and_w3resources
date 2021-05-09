package alicja.examples.timbuchalka;

public class LastDigitChecked {
    //Write a method named hasSameLastDigit with three parameters of type int.
    // Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    // The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
    // EXAMPLE INPUT/OUTPUT:
    //* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
    public static void main(String[] args) {
        boolean hasSameDigit = hasSameLastDigit(28, 666, 346);
        System.out.println(hasSameDigit);

    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        boolean n1Valid = isValid(n1);
        boolean n2Valid = isValid(n2);
        boolean n3Valid = isValid(n3);
        if(!n1Valid || !n2Valid || !n3Valid){
            return false;
        }
        String s1 = n1 + "";
        String s2 = n2 + "";
        String s3 = n3 + "";

        if (s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1)
                || s2.charAt(s2.length() - 1) == s3.charAt(s3.length() - 1)
                || s1.charAt(s1.length() - 1) == s3.charAt(s3.length() - 1)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if ((number < 10) || (number > 1000)) {
            return false;
        }
        return true;
    }
}
