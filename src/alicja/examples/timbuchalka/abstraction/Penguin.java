package alicja.examples.timbuchalka.abstraction;

public class Penguin extends Bird {

    public Penguin(String name){
        super(name);
    }

    @Override // the other methods have been implemented earlier so they are automatically inherited here
    public void fly() {//you overriden this method from interface and also put some specific funcionality for penguin
        super.fly();// calling Bird's fly method (it was overriden there from interface)
        System.out.println("I am not very good at that, can I go for swim instead?");//specific functionaliy
        //so there will be two lines of out put :Bird's "flappign its wings" and penguins the above" i am not very good at that
    }
}
