package alicja.examples.timbuchalka.abstraction;

public abstract class Bird extends Animal implements CanFly {// class Bird is abstract, we cant create its objects
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is pecking");
        //METHOD IMPLEMENTED NOW
    }

    @Override
    public void breath() {
        System.out.println("breathes in, breathes out, repeat");
        //METHOD IMPLEMENTED NOW

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override //this one is taken from interfance, we are not overriding it and giving a code
    public void fly() {// method implemented from INTERFACE
        System.out.println(getName()+"is flapping its wings");
    }

}
