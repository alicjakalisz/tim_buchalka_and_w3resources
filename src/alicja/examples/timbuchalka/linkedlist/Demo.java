package alicja.examples.timbuchalka.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String>placesToVisit= new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);



        printList(placesToVisit);
        placesToVisit.add(1,"Alice Springs");// in position 1 , put Alice Springs, the rest should move furhter
                                                            //you dont overwrite here elements
        placesToVisit.remove(4);
        printList(placesToVisit);




    }
    public static void printList(LinkedList<String> list){
        Iterator<String> i=list.iterator(); //String ITERATOR "i" over the linkedlist "list"
        while(i.hasNext()){//is there next entry/line?
            System.out.println("Now visiting "+i.next());//if so, moves to the next entry (i.next())

        }
        System.out.println("===========================");

    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();//iterator for linkedlist created
        while(stringListIterator.hasNext()){// checking if there is next item to go through
            //after loop checked if there is a next item, it moves to this item,
            // this item is assign to comparison and compare with the city we want to add
            int comparison= stringListIterator.next().compareTo(newCity);
            //if it returns 0, this is a match, we dont want to add
            if(comparison==0){
                //equal, do not add
                System.out.println(newCity+" is already included as a desitnation");
                return false;
            }
            else if(comparison>0){
                // "new city" element should appear before the current one
                //Brisbane--> Adelaide
                stringListIterator.previous();// !! function only in list iterator hat lets you come back to the previous element
                stringListIterator.add(newCity);
                return true;

            }
            else if(comparison<0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner= new Scanner(System.in);
        boolean quit = false;
        boolean goingForward=true;
        ListIterator<String> listIterator= cities.listIterator();
        if(cities.isEmpty()){//
            System.out.println("No cities in this itenerary");
        }else{
            System.out.println("now visiting "+ listIterator.next());//moving the entry
            printMenu();// options 1,2,3....
        }
        while(!quit){// above quit is set up as false, we enter the loop with true(!quit)
            int action=scanner.nextInt();// taking option chosen from the user
            scanner.nextLine();// clearing scanner (always after nextint)
            switch(action){
                case 0:
                    System.out.println("Holidays over");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting"+listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    }
                    else{
                        System.out.println("We are at the start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }

        }

    }
    private static void printMenu(){
        System.out.println("Available actions: \npress ");
        System.out.println("0- to quit\n"+
                "1 - go to next city \n" +
                "2 - go to previous city\n"+
                "3 - print menu options");


    }

}

