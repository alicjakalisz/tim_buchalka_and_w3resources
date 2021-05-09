package alicja.examples.timbuchalka.animalinheritance;

public class Dog extends Animal {
    //after calling the constructor super, you can add new attributes ONLY specific for dog class
  //additional characteristic for specific for dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    // we need to initalize these fields in our constructor, add them to those called from super

    public Dog(String name , int size, int weight, int eyes, int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        // super is calling the constructor of the class that we extended from(it initalize fields from superclass)
        //it is based on Animal class but we can add more features to this class specific for dog, super calls those common for animals
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override //this is to remind that we are overrind the method that exists in super class,
    // if we didnt want to change anything this method would not need to be here as it already exists in super class
    // and we have access from dog object to super class methods.
    public void eat() {
        System.out.println("Dog.eat() called");// executes this sentance Dog.eat()
        chew();// it will call dog method above// Dog.chew()
        super.eat();//it will call this method (original) as well// Animal.eat()
    }

    //lets create specific methods for dog class for type of movements
    // with a use of super clas method inside
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run()called");
        move(10);// this is super method and it will print "Animal is moving at"
    }
    private void moveLegs(int speed ){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move()called");
        moveLegs(speed);
        super.move(speed);
    }
}
