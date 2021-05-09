package alicja.examples.book.exceptions;

public class Main {
    public static void main(String[] args) {

        B b=new B();
        int number = -1;
        boolean wrong = true;
        while(wrong){
            try{
                number=b.getNumberFromC();
                wrong = false;
            }
            catch (Exception ee){
                System.out.println("Exception happened: " + ee.getClass().getCanonicalName());
            }
        }

        //        int number=b.getNumberFromC(); Old value wihout catching the exception. If the user introduces a character in scanner the execution of the program stops
        System.out.println("Main number is " + number);
    }
}
