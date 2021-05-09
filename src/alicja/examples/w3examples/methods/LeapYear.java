package alicja.examples.w3examples.methods;

public class LeapYear {

    //Write a Java method to check whether a year (integer) entered by the user is a leap year or not. Go to the editor
    //
    //Expected Output:
    //
    //Input a year: 2017
    //false

    //To determine whether a year is a leap year, follow these steps:
    //1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    //2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
    //3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    //4. The year is a leap year (it has 366 days).
    //5. The year is not a leap year (it has 365 days). Source of these steps.
    public static void main(String[] args) {
        int year=2020;
        System.out.println(isLeapYear(year));

    }

    public static boolean isLeapYear(int year){
        if((year%4==0)){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
