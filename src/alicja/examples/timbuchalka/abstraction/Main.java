package alicja.examples.timbuchalka.abstraction;

public class Main {

    public static void main(String[] args) {
        Dog dog= new Dog("Yorkie");//you can instantiate class unless it is abstract
        dog.breath();
        dog.eat();

        Parrot parrot= new Parrot("Australian ringneck");// parrot is extending from bird
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin= new Penguin("Emperor");
        penguin.fly();
    }
}
