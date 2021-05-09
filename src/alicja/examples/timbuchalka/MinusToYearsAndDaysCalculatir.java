package alicja.examples.timbuchalka;

public class MinusToYearsAndDaysCalculatir {

    //Write a method printYearsAndDays with parameter of type long named minutes.
    //The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
    //If the parameter is less than 0, print text "Invalid Value".
    //Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
    //XX represents the original value minutes.
    //YY represents the calculated years.
    //ZZ represents the calculated days.
    //EXAMPLES OF INPUT/OUTPUT:
    //* printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
    public static void main(String[] args) {
        printYearsAndDays(346547);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }

        long year=minutes/60/24/365;
        long days=minutes/60/24%365;
        System.out.println(minutes+" min = "+year+" y and "+days+ " d");

    }
}
