package alicja.examples.w3examples.arrays;

public class AreArraysEqual {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 6};
        int[] array2 = {1, 3, 4, 6};
        boolean isEqual=isEquals(array1, array2);
        System.out.println(isEqual);
    }

    public static boolean isEquals(int[] array, int[] array2) {
        boolean isEquals = false;
        if (array.length != array2.length) { //if two arrays are of different lenght, then they are not equals, program finishes.
            return false;
        }

        // here we know that the arrays have the same length
        for (int i = 0; i < array.length; i++) {
                if (array[i] != array2[i]) {
                    return false;
                }
        }

        return true;
    }

}

