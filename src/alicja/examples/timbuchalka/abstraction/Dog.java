package alicja.examples.timbuchalka.abstraction;

public class Dog extends Animal {
    // now it is initially underlines in red telling us we need to implement abstract methods from the abstract class


    public Dog(String name) {
        super(name);// constructor of abstract class is called
    }

    @Override // method eat has been declared in abstract class but not implemented so we are doing it here:
    public void eat() {
        System.out.println(getName()+"is eating"); // get name is a normal method in Animal abstract class (getter)
        //so we already inherited it and can call it here

    }

    @Override
    public void breath() {
        System.out.println("Breathe in, breathe out, repeat");

    }
}
