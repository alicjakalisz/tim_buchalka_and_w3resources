package alicja.examples.book;

public class TwoDecimalArrays {

    public static void main(String[] args) {
        // creating a single array

        double array[]= new double[3]; // array of 3 elemenets , type double created

        // creating two dimensional arrays

        double sales[][]; // declaring
        sales=new double [3][4];  //  (0,0,0,0) (0,0,0,0) (0,0,0,0) pierwszy to columny , drugi to rzedy ALL OF THEM ARE 0 now

        // to access each element you need to use two indexes, first check which array you are going for and then which elenebet inside of this array you want to access

        sales[0][0]= 2456; // means that (2456,0,0,0) (0,0,0,0) (0,0,0,0)

        int[][] table= new int[3][4];
        table[0][0]=5756;
        table[0][1]=5786;
        table[0][2]=56;
        table[0][3]=57656;
        table[1][0]=73566;
        table[1][1]=9876;
        table[1][2]=2345;
        table[1][3]=5;
        table[2][0]=546;
        table[2][1]=235;
        table[2][2]=5435;
        table[2][3]=12;

        System.out.println("\t\tNorth\tSouth\tEast\tWest");
        int year=2004;


        for (int i = 0; i <table.length ; i++) { // the index goes by rows, so by each of the separate arrays
            System.out.print(year++ + "\t");
            for (int j = 0; j <table[i].length ; j++) { // the index goes through all elements of the given array i
                System.out.print(table[i][j]+ "\t");// to display single element of the array we need to show which array and which element of this array so [][]
            }
            System.out.println(); // whenever inner loop is completed, we get out of J loop and execture new line and come back to i loop to go through next iteration of i
            //year=year+1;
        }

        
    }
}
