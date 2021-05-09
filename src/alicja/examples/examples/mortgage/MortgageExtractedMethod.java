package alicja.examples.examples.mortgage;

public class MortgageExtractedMethod {

    public static void main(String[] args){
        greetUser("Mosh", "Hamedarni");
        String messsage =greetUserValue("Mosh", "Hamedani");

        // so far all the codes under main method but for bigger coding you need to break down code under smaller methods. We are going to create one

    }// aafter main method we start with access modifier public - this method can be called from outside of this class
    //static - method that belongs to the class not to the object
    //then type of method if it returns value (for example INT ) and if not void, in the parenthesis- if this method takes any parameters or any input, we add them there, otherwise empty
    // in this demo  the input will be a name of the user
    public static void greetUser(String firstName, String lastName) {// in curly braces code to be executed)
        System.out.println("Hello " + firstName+" "+ lastName);
    } // we have a method that prints the name of the user, we need to call it from MAIN method, buy adding name of the method and

    //*********method returning value - instead of printing on the terminal, we want to return string.
    public static String greetUserValue (String firstName2, String lastName2){
        return "Hello " + firstName2 +" "+ lastName2;  // return statement - returns what we printed in the previous void example, now we need to create variable for this return statement
    }//and you do it in main class - String message = greeetUser("Mosh", "Hamedani");



    public static double calculateMortage(int principal, float annualInterest, byte years){

        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest /PERCENT/MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(monthlyInterest, 1/numberOfPayments));
        // not the real formula!!

        return mortgage;  // now you can go to main method and call method : so variable -> double result= calculateMortage(principal, annualInterset, years) - if you want to print SOUT(result)
    }


}

