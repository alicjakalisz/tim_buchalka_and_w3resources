package alicja.examples.timbuchalka.animalinheritance;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal= new Animal("Animal",1,1,5,5);
        Dog dog= new Dog("Yorkie",8,20,2,4,1,20,"long silky");
        dog.eat();// even if this method is in Animal class, we can use it in dog object which is subclasss

    }
}
