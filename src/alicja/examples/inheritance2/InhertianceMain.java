package alicja.examples.inheritance2;

public class InhertianceMain {
    public static void main(String[] args){

        Dog sausagedog= new Dog(3,"sausage","black","Heniu");
        Animal terrier= new Dog("terrier", "white", "Jasiek");
        System.out.println(sausagedog);
        System.out.println(terrier);
        Cat cat1= new Cat("milk","miau miau","Persian", "brown" ,"Mimi");
        System.out.println(cat1);

        AnimalService animalService = new AnimalService();//  OBIEKT LISTA KTORY PRZYJMUJE OBIEKTY TYPU ANIMAL

        animalService.addAnimal(sausagedog);
        animalService.addAnimal(terrier);
        animalService.addAnimal(cat1);
        System.out.println("Flying animals: " + animalService.getFlyingAnimals());
        System.out.println(" Get number of animals " + animalService.getNumberAnimals());
        System.out.println(" Get by name -mimi " + animalService.getByName("Mimi"));
        System.out.println("Get by name - Dupa " + animalService.getByName("Dupa"));
        animalService.removeAnimal(terrier);
        System.out.println(" number of animals after removing terrier" + animalService.getNumberAnimals());
    }
}

