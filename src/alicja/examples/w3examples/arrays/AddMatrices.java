package alicja.examples.w3examples.arrays;

public class AddMatrices {

    public static void main(String[] args) {// as the method we use in main, throws the expection we need to handle it by try ancd catch
        int[][] matrixA={{1,2},{4,5},{2,4}};
        int[][] matrixB={{1,3,3},{4,5,6},{2,4,8}};
        try{
            int[][] sumOfMatrx=addMatrices(matrixA,matrixB);
            printMatrix(matrixA);

            System.out.println("  +     ");
            printMatrix(matrixB);
            System.out.println("  =    ");
            printMatrix(sumOfMatrx);
        }catch (Exception e){
            System.out.println("An exception has been caugth: " + e.getMessage());
        }
        System.out.println("After try catch this program and the lines below in the main method would continue");
    }

    //Write a Java program to add two matrices of the same size
    // gettting number of rows matrice1.length,  getting number of columns: matrices1[0].length
    public static int[][] addMatrices(int[][] matrice1, int[][] matrice2) throws Exception{
        int rowsMatrix1 = matrice1.length;
        int columsMatrix1 = matrice1[0].length;
        int rowsMatrix2 = matrice2.length;
        int columsMatrix2 = matrice2[0].length;
        if(rowsMatrix1!=rowsMatrix2 || columsMatrix1 != columsMatrix2){
            throw new Exception("The size of the matrices has to be the same");// if the matrices are not of equals length, we need to throw exception and add throws Exception close to the method header
        }// so we are creating after throw a new object of Class Exception and in the parenthesis we display a message

        int[][] sumOfMatrice= new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i <matrice1.length ; i++) {
            for (int j = 0; j <matrice1[i].length ; j++) {
                sumOfMatrice[i][j]= matrice1[i][j] + matrice2[i][j];
            }
        }
        return sumOfMatrice;

    }
    public static void printMatrix(int[][]matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
