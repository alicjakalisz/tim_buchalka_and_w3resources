package alicja.examples.timbuchalka.cylinder;

public class Circle {
    //fields
    private double radius;
    //constructor
    public Circle(double radius){
        if(radius<0){
            this.radius=0;
        }
        else{
            this.radius=radius;
        }
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

}
