package oop2;

public class Main {

    public static void main(String[] args) {

        A objectA= new A("dupa");
        B objectB= new B("cipa", "chuj");
        C objectC= new C("mozg", "flaki", "reka");
        C objectC2= new C("mozg", "flaki", "reka");
        System.out.println(objectB.getX());
        System.out.println(objectA.getX());
        System.out.println(objectC.getX());
        System.out.println(objectA);// you can print object by passing object in the parenthesis, the metod toString is automatically executed. You need to set up this method in every class.
        // it prints String representation of the object so all of its attributes in string form.
        System.out.println(objectB);
        System.out.println(objectC);
       // System.out.println(objectB.equals(objectC));// returns boolean it says if this is true or not, equals method comes from Object Class
        System.out.println(objectC.equals(objectC2));

    }
}
