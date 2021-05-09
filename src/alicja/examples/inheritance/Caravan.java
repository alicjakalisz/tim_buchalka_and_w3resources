package alicja.examples.inheritance;

public class Caravan extends AbstractVan {//alt enter to implement methods from Abstract Van
// other methods that belong to the class Car are already implemented so we do nt need to do it here

    // Attributes
    private Integer beds;

    //Constructors:
    public Caravan(){
        super();// i am calling constructor of the class above (abstract class) and abstract class has also in its constructor key word super to call Car
        beds=4;
    }

    public Caravan(boolean diesel2, Integer wheels2, String brand2, Float trunkSize2, Integer passengers2, Integer beds2){
        super(diesel2, wheels2, brand2, trunkSize2, passengers2);
        beds= beds2;
    }

    //Methods
    @Override
    public Integer getBeds() {
        return beds;
    }
}
