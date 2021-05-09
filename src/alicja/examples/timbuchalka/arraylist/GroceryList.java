package alicja.examples.timbuchalka.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

    }

    private int[] myNumbers; //?? array cannot hold the objects (apart from Strings)
    ArrayList<String> groceryList= new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);

    }
    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size()+" items in your gorecery list");
        for (int i = 0; i <groceryList.size() ; i++) {
            System.out.println((i+1)+  ". "+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position +1)+" has been modified"
        );
    }
    public void removeGrocery(int position){
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchedItem){
        boolean exists=groceryList.contains(searchedItem);//check if exists
        int position = groceryList.indexOf(searchedItem);// returns index of the item we look for
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }


}
