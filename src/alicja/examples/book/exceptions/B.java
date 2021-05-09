package alicja.examples.book.exceptions;

public class B {

    public int getNumberFromC(){
        C c=new C();
        int number=c.getNumber();
        System.out.println("B get number "+ number);
        return number;

    }
}
