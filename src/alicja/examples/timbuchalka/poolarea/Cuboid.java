package alicja.examples.timbuchalka.poolarea;

public class Cuboid extends Rectangle {
    private double height;


    public Cuboid(double length, double width, double height){
        super(width,length);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolumne(){
        return getArea()*getHeight();
    }
}
