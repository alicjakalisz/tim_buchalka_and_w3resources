package alicja.examples.oop;

public class BaseBall extends MiddleBall { // Baseball is a subclass of a Ball


    public BaseBall(){
        System.out.println("This is Baseball");
    }

    public BaseBall(String colour){
        super(colour); // calling middleball constructor with a color as a parameter, not the empty one , if you dont put super, it will call empty constructor of middleball

    }

    @Override
    public void throwIt(){
        System.out.println("throwing baseball");
    }

}
