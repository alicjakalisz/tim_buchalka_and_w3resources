package alicja.examples.oop;

public class Ball  {
    protected   final static String DEFAULT_COLOUR ="Blue"; // public to use with other classes; static that allows to access without creating the object of class Ball// public static final
    public String colour;

    public Ball(){
        colour=DEFAULT_COLOUR;
        System.out.println("this is a ball "+ colour);
    }

    public Ball(String colour){

        this.colour=colour;
    }
}
