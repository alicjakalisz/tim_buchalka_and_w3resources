package alicja.examples.timbuchalka.carinheritance;

public class Car1 extends Vehicle1 {
private int wheels;
private int doors;
private int gears;
private boolean isManual;

private int currentGear;

    public Car1(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }



    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Car.setCurrentgear(): Changed to: "+this.currentGear);
    }
    public void changeVelocity(int speed,int direction ){

        System.out.println("Car.changeVelocity()");
        move(speed,direction);
    }

}
