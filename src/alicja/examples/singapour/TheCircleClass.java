package alicja.examples.singapour;

public class TheCircleClass {
    private double radius;
    private String colour;
    private static final double DEFAULT_RADIUS=1.0;
    private static final String DEFAULT_COLOUR="red";

    public TheCircleClass() {// default constructor
        this(DEFAULT_RADIUS,DEFAULT_COLOUR);
    }

    public TheCircleClass(double radius) {// overloaded constructor with radius parameter
        this(radius,DEFAULT_COLOUR);
    }

    public TheCircleClass(double radius, String colour){// overloaded constructor with
        this.colour=colour;
        if(this.radius<0){
            this.radius = 0;
        }
        else{
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(double radius){
        return radius*radius*Math.PI;
    }
    public String getColour(){
        return colour;
    }
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public void setColour(String newColour){
        this.colour=newColour;
    }

    @Override
    public String toString() {
        return "TheCircleClass{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}
