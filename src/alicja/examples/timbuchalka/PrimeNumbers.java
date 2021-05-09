package alicja.examples.timbuchalka;

public class PrimeNumbers {

    //Write a method named getLargestPrime with one parameter of type int named number.
    //If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
    //The method should calculate the largest prime factor of a given number and return it.
    //EXAMPLE INPUT/OUTPUT:
    //* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
    //* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
    //* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
    //* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
    //* getLargestPrime (-1); should return -1 since the parameter is negative
    public static void main(String[] args) {
        int largestPrimeFactor=getLargestPrime(45);
        System.out.println(largestPrimeFactor);


    }
    public static int getLargestPrime(int number){
        int largestPrimeFactor=0;
        for (int i = 2; i <number ; i++) {
            if(isPrime(i)){
                if(number%i==0){
                    if(i>largestPrimeFactor){
                        largestPrimeFactor=i;
                    }
                }
            }

        }
        return largestPrimeFactor;
    }
        public static boolean isPrime(int number){
            for (int i = 2; i <number ; i++) {
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
}
