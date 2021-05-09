package alicja.examples.inheritance;

public interface Vehicle {// GENERETIC OPERATIONS FOR ALL VEHILCES (COMMON FOR BIKE AND CARS)- if more specific, that needs to be defined in the class
    public Integer getNumberWheels(); // this is an interfejs, we are defining the operations of interface (methods), BUT without implementation so NO CURLY BRACES,
                                        //all the methods in the interface by the default are public so you can omit this word it is grey.
    public boolean isDiesel();
    public Integer getMaxSpeedAllowed();
    public String getBrand();
    public Integer getPassengers();

    //we have defined our interfejs with operations
    // that is , this is how you create interface, you dont include any syntax, any code just : RETURN TYPE, NAME and PARAMETERS (if there are, here no parameters)
    //when you create class (implementing Vehilce interface into it) you need to implement ALL the methods frmo this interface, you cannot omit any
    // when you update interface, you need to update all of the implementation classess!
}



