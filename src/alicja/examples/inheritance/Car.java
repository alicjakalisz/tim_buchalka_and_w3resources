package alicja.examples.inheritance;
// class and this is not main class, so we dont have main method here, we are defining Class Car so later we can create objects.
// We are implementing the methods(operations) of the Vehicle interface(mother class) in Inteface there are only defined and here we implemented them.
public class Car implements Vehicle {
// alt + enter adds all the methods defined in Interface
// iniially the are empty, no code to execute, we need to add it now:

    // there are 3 elemenets of the class:
    //1- Class Atributes
    //2- Class constructors
    //3- Class methods - are below


    //Atributes: you create them looking at the methods

    private Integer wheels; // you dont define the value yet
    private Integer maxSpeed;
    private Boolean diesel;
    private String brand;
    private Float trunkSize;
    private Integer passengers;

    // we did not set the value as they are in constructors so now we are going to create constructors

    //CONSTRUCTORS: they are used to create the object- public Car(){}<-----you call it later as new Car();
    //if you dont declare contructos in your class the default one exists and it is the one below

    public Car(){
        wheels=4;
        maxSpeed=120;
        diesel=false; // default contructors with default hard coded attributes of a car and NO PARAMETERS
        brand="Any";
        trunkSize=5.0f;
        passengers=5;
    }
    public  Car(boolean diesel2, Integer wheels2, String brand2, Float trunkSize2, Integer passengers2){// if you want a car with non default attributes, you need to define them in parameters and whatever is default you repeat as it is ,
                                                //however  you  still need to assign the parameters value to the atttributes
        diesel=diesel2;
        maxSpeed=120;
        wheels=wheels2;
        brand=brand2;
        trunkSize=trunkSize2;
        passengers=passengers2;
    }

    // ABOVE ARE TWO CONTRUCOTS (can be more) so these ate two different ways to create Car object.

    //METHODS:
    @Override
    public Integer getNumberWheels() {
        return wheels;// returns attribute of wheels
    }

    @Override
    public boolean isDiesel() {
        return diesel;
    }

    @Override
    public Integer getMaxSpeedAllowed() {
        return maxSpeed;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public Integer getPassengers() {
        return passengers;
    }

    public Float getTrunksize(){
        return trunkSize;
    }
}
