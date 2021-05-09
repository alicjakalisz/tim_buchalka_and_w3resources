package alicja.examples.inheritance;
// convention is that when you create class abstract class you put Abstract at the beginnig of the name of this class
public abstract class AbstractVan extends Car{// we are defining it at abstract and this class extend class Car (so this is a subcategory Car(specialisation)
    //we are going to put inside common methods/attributes for categories under this class - so for Classes: Van, MiniVan and Caravan
    // you cannot create new instance of NEW abstract van, BUT you CAN do it for Van, MiniWan and Caravan classes as those are concrete classes.

    public AbstractVan(){ // this constructos calls default construcots in class Car
        super();
    }

    public AbstractVan(boolean diesel2, Integer wheels2, String brand2, Float trunkSize2, Integer passengers2){ // this construcots call specific construcots in class car
        super(diesel2, wheels2, brand2, trunkSize2, passengers2);
    }

    //Abstract Van contains all of the methods/attributes of Class PLUS new - common for concrete classes under it
    public abstract Integer getBeds(); // while defining method you need to add abstract here


}
