package alicja.examples.oop;

public class MiddleBall extends Ball {

    public MiddleBall(){
        System.out.println("This is a middleball");
    }

    public MiddleBall(String colour){
        super(colour);
    }

    public void throwIt(){
        System.out.println("throwing middleball");
    }
}
