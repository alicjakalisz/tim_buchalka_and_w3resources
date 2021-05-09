package alicja.examples.book.operations;

public class Increment {

    public static void main(String[] args) {
        int i=2;
        printInteger(i);// 2
        printInteger(i++);// 2 increment is happening after exectuion of the method
        System.out.println(i);//3

        printInteger(++i); //4 incremenet is happening before execution of the method so 3+1
        System.out.println(i);//4
        System.out.println(i--); //4
        System.out.println(i);//3
        System.out.println(--i);//2
        System.out.println(i);//2
    }

    public static void printInteger (int number){
        System.out.println("inside of method prin integer number equals to " + number);
    }
}
