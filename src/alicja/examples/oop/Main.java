package alicja.examples.oop;

public class Main {
    public static void main(String[] args) {
        BaseBall b= new BaseBall(); // it calls Ball constructors as Baseball extends Ball and then Baseball constructor
        b.throwIt();
        MiddleBall s= new MiddleBall();
        s.throwIt();
        System.out.println("Displaying: "+ Ball.DEFAULT_COLOUR) ; // I am accessing a constant ,static so i dont need to create an instance of ball, Ball. is enough, all constants are set as FINALS
        System.out.println("Display middleball colour: "+s.colour);
        Ball baseBall= new BaseBall("Red");
        System.out.println("Display baseball colour: "+baseBall.colour);


    }

}
