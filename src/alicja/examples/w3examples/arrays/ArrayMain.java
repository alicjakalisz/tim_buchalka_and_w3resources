package alicja.examples.w3examples.arrays;

import java.util.Arrays;

public class ArrayMain {


    public static void main(String[] args){

        int[] array={1,2,46,7,8};
        System.out.println(Arrays.toString(array));
        insetElement(array,-5,3);
        System.out.println(Arrays.toString(array));
        System.out.println(getMinvalue(array));
        System.out.println(index(array,46));// return method so i can print it out in main as it returns integer
        int result=index(array,46);
        if(result==-1){
            System.out.println("outside of array scope");
            reverseOrder(array);// i have now reversed the order
            System.out.println(array);//now you can print the array after swapponig
        }
    }

    public static void insetElement(int[] array, int number, int position){

        if(position<array.length && position>=0){
            array[position]=number;
        }else{
            System.out.println("Position needs to be within array");

        }
    }

    public static int getMinvalue(int[] array){            // for(int i =0; i<6; i++) {};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            System.out.println("i="+ i + " minimum value=" + min);
            if(array[i]<min){
                min = array[i];
                System.out.println("New minimum value is " + min);
            }
        }

        return min;
    }



    public static int getMaxValue(int[] array){            // for(int i =0; i<6; i++) {}
        int max=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        return max;

    }

    //Write a Java program to sort a numeric array and a string array.
    // two methods can be called the same (method overloading) if one has parameeter for different data type( integer or String array in this example)

    public static void sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[] array){
        Arrays.sort(array);
    }

    //Write a Java program to sum values of an array
    public static int getSumOfValuesInArray(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){// this is to run all values from the array - to display all the numers and below is a function which does something with each new numeber thac comes
            sum=sum+array[i];
           // sum+=array[i]; different option

        }
        return sum;
    }

    // Write a Java program to test if an array contains a specific value

    public static boolean contains(int[] array, int number){
        for(int i=0; i<array.length; i++){
           if(array[i]==number){
               return true;
           }
        }
        return false;
    }

    // Write a Java program to find the index of an array element

    public static int index(int[] array, int number){
        for(int i=0; i<array.length;i++ ){
            if(array[i]==number){
                return i;
            }
        }
        return -1;// after the return you cannot put any code as this is end of the code of this method
    }

    //Write a Java program to insert an element (specific position) into an array.
    public static void changeIndexValue(int array[], int num, int position){
        array[position]=num;
    }

// Write a Java program to reverse an array of integer values

    public static void reverseOrder(int array[]){
        for(int i=0; i<array.length/2; i++){

            int temp = array[i];// inititall value of array given , for example array{1,3,6,8,9}, so i=1, array[0]
            array[i]=array[array.length-1-i];// modifying value of array[i](1) and changing it to array[array.lengh-1-i] (9) (first interation only!) -->{9,3,6,8,9}
            array[array.length -1 -i] = temp;// assiging to array[9] temp value which was 0 -->{9,3,6,8,1}
        }
    }

}
