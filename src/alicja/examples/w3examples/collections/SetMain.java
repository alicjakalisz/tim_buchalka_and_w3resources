package alicja.examples.w3examples.collections;

import java.util.*;

public class SetMain {
 //SETS- similar to LISTS but UNIQUE (no duplicates) and they dont have an order, they dont have an INDEX


    public static void main(String[] args){

        Set<Integer> s1=new HashSet<Integer>(); // creating empty set of int type, EMPTY CONTRUCTOR

        s1.add(5);//mehotd add is of boolean type and returns either true or false
        s1.add(7);//true
        s1.add(7);//false
        s1.add(8);
        System.out.println(s1);// it will print only [5,7] becuase it is not printing duplications
        // ANTOHER WAY TO CREATE SET BUT INESTING ALL THE ELEMENTS IN ONE GO
        Integer [] array ={1,56,45,3,4,5};//FIRST STEP: create array to pass it to the list (but create it as Integer class, not it
        Set<Integer> s2=new HashSet<Integer>(Arrays.asList(array));
        s1.remove(7); //function remove exisits both for lists and sets but for lists it requires index and for sets - object so element inside the set.
        System.out.println(s1);
        System.out.println(s2);
        s2.addAll(s1); // adding two sets
        System.out.println(s2);// result printed out

        List<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(7);
        l.add(9);
        l.add(5);
        l.add(1);
        System.out.println(l);
        s2.addAll(l); // COLLECTIONS ARE LISTS AND SETS - you can add them together - set will skip the numbers which are already in the list as only unique
        System.out.println(s2);

    }
}
