package alicja.examples.inheritance2;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    // attribute List of Animal (interface) called animals.
    private List<Animal> animals; // empty object , not initialized yet

    public AnimalService() {// OBIEKTY KLASY ANIMALSERIVE SA LISTA , KTORA PRZYJMUJE TYLKO OBIKETY TYPU ANIMAL
        this.animals = new ArrayList<>();// initalaized
    }

    public boolean addAnimal(Animal animal) {// DODAC DO OBIEKTU LISTA OBIEKT CLASY ANIMAL (CZYLI DOG, CAT, COKOLWOIEK POD INTERFACIE ANIMAL)
        return animals.add(animal);
    }

    public boolean removeAnimal(Animal animal) {// USUNAC Z OBIEKTU LISTA OBIEKT CLASY ANIMAL
        return animals.remove(animal);
    }

    public List<Animal> getFlyingAnimals() {
        return null;
    }

    public Integer getNumberAnimals() {// METHODA PODAJE ILE JEST OBIEKTOW W OBIECKIE LISTA
       return  animals.size();
    }

    public Animal getByName(String name) {
        for(Animal a: animals){
            if(a.getName().equals(name)){
                return a;
            }
        }
        return null;
    }


}
