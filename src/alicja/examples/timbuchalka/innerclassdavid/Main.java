package alicja.examples.timbuchalka.innerclassdavid;

public class Main {

    public static void main(String[] args) {

        Container.Inner inner= new Container(5).new Inner(4);
        //trying to create object of the inner class PrivateInner which is private
        //it doest not let me.
    }
}
