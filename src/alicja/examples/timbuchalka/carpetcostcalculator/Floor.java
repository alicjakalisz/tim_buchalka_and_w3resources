package alicja.examples.timbuchalka.carpetcostcalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(int width, int length){
        if(length<0){
            this.length=0;
        }
        else {
            this.length=length;
        }
        if(width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
        this.width=width;
    }
    public double getArea(){
        return width*length;
    }
}
