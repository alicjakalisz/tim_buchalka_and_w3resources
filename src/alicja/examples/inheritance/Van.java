package alicja.examples.inheritance;

public class Van extends AbstractVan{

    // Attributes
    private Integer beds;

    //Constructors:
    public Van(){
        super();// i am calling constructor of the class above (abstract class) and abstract class has also in its constructor key word super to call Car
        beds=2;
    }

    public Van(boolean diesel2, Integer wheels2, String brand2, Float trunkSize2, Integer passengers2, Integer beds2){
        super(diesel2, wheels2, brand2, trunkSize2, passengers2);// i am calling constructor of the class above (abstract class) and abstract class has also in its constructor key word super to call Car
        beds=beds2;
    }

    //Methods
    @Override
    public Integer getBeds() {
        return beds;
    }
}
