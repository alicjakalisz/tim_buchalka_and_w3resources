package alicja.examples.timbuchalka.oop;

public class MainOOP {

    public static void main(String[] args) {
        SimpleCalculator calculator= new SimpleCalculator();
        calculator.setFirstNumber(12);
        calculator.setSecondNumber(2);
        System.out.println("first number: "+calculator.getFirstNumber());
        System.out.println("second number: "+calculator.getSecondNumber());
        System.out.println("add: "+calculator.getAdditionResult());
        System.out.println("division: "+calculator.getDivisionResult());
        System.out.println("multiplication: "+ calculator.getMultiplicationResult());

        BankAccount bobAccount= new BankAccount();
        bobAccount.withdrawFunds(100);
        bobAccount.depositFunds(100);
        bobAccount.setAccountNumber(153454);
        bobAccount.setCustomerName("Bob Smith");
        bobAccount.setEmail("bob@gmail.com");
        bobAccount.setPhoneNumber(456467676);

        Point punkt1= new Point();
        Point punkt2= new Point(10,2);

        System.out.println(punkt1.distance());
        System.out.println(punkt1.distance(3,4));
        System.out.println(punkt1.distance(punkt2));


    }
}
