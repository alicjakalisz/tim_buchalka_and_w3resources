package alicja.examples.timbuchalka.arrays;

import java.util.*;

public class ArrayChallenge {
    public static void main(String[] args) {

       int[] array=getIntegers();
       int[]sortedArray=sortArray(array);
       printArray(sortedArray);
    }

    public static int[] getIntegers() {
        int[] array;
        int counter = 0;
        System.out.println("Give number of elements for the array");
        Scanner scanner = new Scanner(System.in);
        boolean hasInt = scanner.hasNextInt();
        while (!hasInt) {
            System.out.println("The number of elements must be in int");
            scanner.nextLine();
            hasInt = scanner.hasNextInt();
        }
        counter = scanner.nextInt();
        scanner.nextLine();
        array = new int[counter];
        int input = 0;
        for (int i = 0; i < counter; i++) {
            System.out.println("Give element nr " + (i + 1));
            hasInt = scanner.hasNextInt();
            while (!hasInt) {
                System.out.println("the elements must be of type int");
                scanner.nextLine();
                hasInt = scanner.hasNextInt();
            }
            input = scanner.nextInt();
            scanner.nextLine();
            array[i] = input;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortArray(int[] array) {
        int[] newArray = array.clone();
        for (int i = 0; i <newArray.length ; i++) {
            int max=Integer.MIN_VALUE;
            int index =-1;
            for (int j = i; j <newArray.length ; j++) {
                if(array[j]>max){
                    max=newArray[j];
                    index = j;
                }
            }
            //After the j loop finish, we know that we have to swap the index i with the index "index"
            int temp = newArray[i];
            newArray[i]= newArray[index];
            newArray[index] = temp;

        }
        return newArray;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            list.add(array[i]);
//        }
//
//        Collections.sort(list);
//        System.out.println(list);
//        int[] newArray = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            newArray[i] = list.get(i);
//            System.out.println(Arrays.toString(newArray));
//        }


    }
    public static int[] sortedTim(int[] array){
        int[]newArray= new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            newArray[i]=array[i];
        }

        boolean flag=true;
        while(flag){
            flag=false;
            for (int i = 0; i <newArray.length ; i++) {
                int temp=0;
                if(newArray[i]<newArray[i+1]){
                    temp=newArray[i];
                    newArray[i]=newArray[i+1];
                    newArray[i+1]=temp;
                    flag=true;


                }

            }

        }
        return newArray;
    }

}
