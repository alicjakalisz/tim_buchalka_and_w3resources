package alicja.examples.book.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lists {
    //list is an INTERFACE
    //difference you dont need to define the size, it is mutuable, in array you need to delcare the size and cannot change it later
    //you can add the elements


    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>(); // htis is how you create the list, empty constructor
        list.add(5);
        System.out.println(list);

        //now we are creating a set and will pass it to the constructor of the list
        Set<Integer> set= new HashSet<>(); //enpty set declaration
        set.add(4);
        set.add(6);
        set.add(54);
        // you can pass any kind of collection to the list,it will take the element of collection and assign it to the list, below we are assigning setś elements to the list
        List<Integer> list2 = new ArrayList<>(set); // we have created another list and all the elements of the list were taken from the set, we passed it
        System.out.println(list2);
        System.out.println(set);
        //List list had 1 element 5 and now we are adding all the elements of set to this list:
        list.addAll(set);
        System.out.println(list);
        // inserting new elements in the index once the list already exists
        list.add(3,9);// first is the index second is the value we want to insert
        System.out.println(list);
      //  list.add(9,9);
       // System.out.println(list); THIS WILL THROW EXEPCTION THE INDEX IS OUT OF BOUNDS

        System.out.println(list.get(0));

        // INTERATING THROW THE LIST

        for (int element: list) {

            System.out.print(element + ",");
        }
        System.out.println();

        //index of
        list.indexOf(9); // giving the index of the  first element it finds  (of elemenent that you inserted in ()
        System.out.println(list.indexOf(9));

        boolean isThere=list.contains(7);
        System.out.println(isThere);
        System.out.println(list.size()); // number of elements int

        list.add(5);
        list.add(9);
        list.add(8);
        list.add(9);
        System.out.println(list);// you dont need Array.toString or loop to print the elements of the list
        System.out.println(list.lastIndexOf(9));

        // if you want to go through all elements of the list but not only to print them you need to iterate through them using loop
        //the only difference with array for loops is that is array.lenght to  give you numbers of elements and here it is method size AND array[i] and list.get()
       //interation of list
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+",");

        }

        System.out.println();


        //if you want to modfiy one of the elements of the list you use method.set

        list.set(0,1);
        System.out.println(list);

        // removing elemenets

        list.remove((Integer)9);

    }
}
