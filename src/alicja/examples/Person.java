package alicja.examples;

public class Person {
    // attributes
    private String name;

    //contructors
    public Person(String name2){
        name=name2;
    }

    //methods

    //getters - does not take parameters and only returns something

    public String getName(){
        return name;
    }

    //setters - does not return anythig, just modifiying already exisiting data// set == change
    public void setName(String name2){
        name=name2;
    }
}
