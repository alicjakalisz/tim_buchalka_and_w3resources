package alicja.examples.examples;

public class RemainingBalanceToPay {

    public static void main(String[] args) {

      /*  int mortgage = 120000;
        int installment = 12000;

        for (int i = mortgage; i >= 0; i = i - installment) {
            System.out.println("Remaining balance: " + i);
            mortgage = mortgage - installment;
            ;
        }

        System.out.println("Balance is: " + (mortgage + installment));
*/

 /*       int remaining=120000;
        int intallment=1200;
        while(remaining>=0){
            System.out.println("remaining is: "+ remaining);
            remaining=remaining-intallment;
        }*/

      /*  int remaning = 120_000;
        int installment = 1200;
        do {
            remaning = remaning - installment;
            System.out.println("Remaning is: " + remaning);
        }  while (remaning > 0) ;
    */
    }

    public static boolean getBalance(int balance, int instalment){
        for(int i=balance; i> 0 ; i = i - instalment){
            System.out.println(i);
        }
        return true;
    }


}