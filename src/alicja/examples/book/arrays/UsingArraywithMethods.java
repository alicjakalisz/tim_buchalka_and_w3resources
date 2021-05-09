package alicja.examples.book.arrays;

public class UsingArraywithMethods {

    public static void main(String[] args) {

        //you can create a method that has an array as parameter and/or return array
        //example

        String[] test = getNamesofWeek();
        String[] drugiString= {"slowo", "drugie slowo", "trzecie"};
        printArray(drugiString);

        printArray(test);
        for( String day : test){ // printing out elements of array using enhanced loop
            System.out.println(day);
        }

        for (int i = 0; i <test.length; i++) { // printing out elements of array using traditional for loop
            System.out.println(test[i]);

        }
    }
// method that get the name of week days
    public static String[] getNamesofWeek(){

        String[] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days;
    }

 // method that print the content of any array String

  public static void printArray (String [] array){
        for ( String element : array){
            System.out.println(element);
        }

  }

}
