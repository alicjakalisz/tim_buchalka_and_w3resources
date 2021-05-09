package alicja.examples.inheritance;

public class InheritanceMain {

    public static void main(String[] args){
        Vehicle seat= new Car();// object seat created using class Car , in that case i can use only methods definied in the interface, not specific method of this class. but this is instance of CAR still.
                                //this is object with a use of default constructor so assigned hard coded atrtributes
        Vehicle volvo= new Car(false,4,"volvo",45f, 5);// object class Car using another contructors (attributes in parenthesis)
                                    // you can put all the attributes of class car there (also those not defined in vehilce interface but when we use this object later,
                                    // it is just seen as vehicle with its methods.
       // volvo. does not have trunksize
        // WE ARE NOW DISPLAYING ATTRIBUTES USING FUNCTIONS OF CLASS CAR as THESE METHODS ONLY RETURNS ATTRIBUTES ANDNNOTHNG ELSE!!!!!!!!!!!!!
        System.out.println("Car 1 is " + seat.getBrand() + " diesel="+ seat.isDiesel() + " wheels="+ seat.getNumberWheels() + " maxSpeed=" + seat.getMaxSpeedAllowed());
        System.out.println("Car 2 is " + volvo.getBrand() + " diesel="+ volvo.isDiesel() + " wheels="+ volvo.getNumberWheels() + " maxSpeed=" + volvo.getMaxSpeedAllowed());


        Car fiat=new Car(true,4,"fiat",55f, 5);
        //fiat.- created by class Car so has all of the methods defined in thsi class so both generic for interface and specific for this class
        //modifiers: private or public , private you only use it within a class , not outside, it is good to use private on attributes so when we create an object in main class, atributures are not coming up

        /*
            MODIFIERS:
            PUBLIC
            PRIVATE
            EMPTY - NO MODIFYER- you can access empty modifier atritbutes/method within one package
            PROTECTED- u can access in the same package and as well you can just access from alicja.examples.inheritance
         */

        //Default caravan
        Caravan c = new Caravan();// we are crreating instance of CAravan class using default constuctor with all atributes hard coded
        System.out.println("Caravan c is " + c.getBrand() + " diesel="+ c.isDiesel() + " wheels="+ c.getNumberWheels() + " maxSpeed=" + c.getMaxSpeedAllowed() + " beds=" + c.getBeds());

        //Non Default caravan
        Caravan c2 = new Caravan(true, 6, "opel", 55f, 10, 5);
        System.out.println("Caravan c2 is " + c2.getBrand() + " diesel="+ c2.isDiesel() + " wheels="+ c2.getNumberWheels() + " maxSpeed=" + c2.getMaxSpeedAllowed() + " beds=" + c2.getBeds());

    }


}
