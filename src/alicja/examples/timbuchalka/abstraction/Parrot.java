package alicja.examples.timbuchalka.abstraction;

public class Parrot extends Bird {

    public Parrot(String name){
        super(name);
    } // constructor;



    // eat() and breath()  are already overriden in a  Bird class (as extended from Animal abstrac class)
    // so we dont need to reimplement them again (but we can still override them here if we want to change the code

    //the only one which was declared as new method but not implemented in Bird
    // is fly(); so we need to overrde it here to add behaviour and make this class valid.

   // @Override
    //public void fly() {
      //  System.out.println("Flitting from branch to branch");
    //}

    //after adding method fly() to newly created interface and making Bird class implements this method, we can now delete the above method
    //because it is now going to be inherited from Bird automatically

}
