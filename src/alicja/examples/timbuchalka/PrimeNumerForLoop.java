package alicja.examples.timbuchalka;

public class PrimeNumerForLoop {
    public static void main(String[] args) {
        int count=0;
        for (int i = 10; i <50 ; i++) {
            if(isPrime(i)){
                count=count+1;
                System.out.println("Numer "+i+" is prime number");
            }
            if(count>3){
                System.out.println("Exiting loop");
                break;
            }
        }

    }
    public static boolean isPrime(int number){
        if(number==1){
            return false;
        }
        for (int i = 2; i <number/2 ; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
