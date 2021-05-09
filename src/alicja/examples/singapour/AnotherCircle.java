package alicja.examples.singapour;

public class AnotherCircle {
    private double radius=1.0;

    public AnotherCircle() {
    }

    public AnotherCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*Math.PI*2;
    }

    @Override
    public String toString() {
        return "AnotherCircle{" +
                "radius=" + radius +
                '}';
    }
}
