package alicja.examples.w3examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsMain {

    // MAP - key and value (of storage), you can have a map that the key is String and the value is Integer for example,
    // similarly to SET it does not have INDEX, therefore you cannot use normal for loop , you need to use FOR EACH loop in you need

    public static void main(String[] args) {

        Map<String, Integer> peopleAges = new HashMap<>(); // created empty Map with Key String and Value - Integer type

        peopleAges.put("David", 35);
        peopleAges.put("Gabriel", 2);
        peopleAges.put("Victoria", 1);
        System.out.println(peopleAges);
        System.out.println(peopleAges.keySet()); // getting only keys of the map
        System.out.println(peopleAges.get("David")); // you put object here (so the key and you can input only one adn it returns value of this key

        //  FOR EACH LOOP
        for(String person:peopleAges.keySet()){ // on the right side of ":" - collection type only so MAP is not collection, therefore to run the loop, we need to extract only keysset (names here)
                                                //on the left side of ":" you put type of the collection and name of the variable to itereate
            //                                  //(this is like i in for loops, where i was just and index and here this is an object
            int age=peopleAges.get(person);// age of Victoria as Victoria is a first key in the MAP, second David and third Gabrial, the loop will run in this order;
            // age variable has function "get" assigned which returns the value of the given key (person: David, Victoria, Gabriel);
            // person is as the loops goes : Victoria, David, Gabriel, in that moment loop uses function get and assigned age for each of them (you put the key (name) and value is brough (age)
            System.out.println(person +" is "+ age+ " years old" ) ;
        }



    }

}
