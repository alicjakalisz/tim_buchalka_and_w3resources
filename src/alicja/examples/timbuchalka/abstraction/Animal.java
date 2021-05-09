package alicja.examples.timbuchalka.abstraction;
// we are setting up abstract class by adding "abstract" in front of class
public abstract class Animal {
    //attributes
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //methods
    public abstract void eat();

    public abstract void breath();

    public String getName() {
        return name;
    }
}

    //  ALL ABSTRACT METHODS declared here NEED to be IMPLEMENTED in the class that implements this class.
    // if inheritance goes down and these methods are alreddy implemented then you dont need to call them.
    //all the abstract methods needs to be implemented in a class that directly extends from abstract class
    // IN THE INHERITANCE of NORMAL BASE CLASS there is NO requirement to implement those methods. In case of abstract methods it is a must
   //in Abstract class there might be abstract and normal methods