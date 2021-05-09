package alicja.examples.examples;

public class ControllingFlow {

    public static void main(String[] args) {
        //***************CONTROLLING THE FLOW OF EXECUCTION OF OUR PROGRAMMS**************

        //*********************comparison operators - we used them to compare PRIMITIVE values

        int x = 1;
        int y = 1;

        System.out.println(x == y); // == is a comparison operator, (it is not equal sign which is used for assignment); you get true or false

        System.out.println(x != y);// < > <= >=

        //*******************logical operators


        // boolean variable but expression assigned can be  with integer for example
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;// we want to check expression if it is warm and for us wamrm is over 20 degrees, we need to create variable to store the outcome of expression
        //of the boolean type; && is AND . If both is true then it is true. Java evaluates this conditin from left to right
        System.out.println(isWarm);

        boolean hasHighIncome = true; // boolean can be expression as above or has value true or false as we know this information (it doesnt need to be mathematical for example statemnt grass is green)
        // and there will be 3rd boolean with the expression , (similarly to INT can have numbers  x=1 assigned directly or expresion X=2-y and boolean can have value boolean = true/false or expression (comparing two INTs, booleans etc)
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // here is an expression || is OR hasCriminalREcord is false so in order to make the expresion true
        //you need to reverse the last boolean with !

        //**********************If statements

        //If temp is greater than 30
        // It's a hot day. Drink plenty of water
        //Otherwise, if it's between 20 and 30
        // It's a nice day
        //Otherwise
        // It's cold


        int temp = 27;     //first integer for data to be checked

        if (temp > 30) {// boolean expression in parenthesis and CURLY BRACES for code to be executed if expression is true
            System.out.println("It's a hot day"); // now under expression you write a code to be executed if the expression is true.
            System.out.println("Drink plenty of water");

        } else if (temp > 20 && temp <= 30) {// after CURLY braces another expression else if in parenthesis and CURLY braces for code to be executed if this is true
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold Day");


        }


        // **********SIMPLIFYING IF STATEMENTS
        boolean hasHighIncome1= false; //poczatkowa wartosc
        int income = 120_000;

        if (income > 100_000){
            hasHighIncome1 = true;// if income is > 100K then someone hasHighIncome - so the code executed is boolean variable at value true.
            System.out.println("the guy has high income");                        // You cannot intiate variable inside the block,you need to initiate boolean hashihgincome1 above, before if.

        }else {                                         // jak dalismt na samej gorze poczatkowo warotsc false to tego juz nie potrzebujemy, if the income>100000 and it is true then the code stops here.otherwise it is false.
            hasHighIncome1 = false;
            System.out.println(" The guy is poor");
        }


      // SIMPLIFY CODE -INSTEAD OF IF STATEMENT - USE boolean with EXPRESSION to meet critiers for true;  avoid hardcoding like 1, 2, - true, false, you can use expressions

        //int income = 120000;
        //boolean hasHighIncome1 = income>100000;




        //****************TERNARY OPERATOR

        //int income1 = 100000;
        //String className;
        //if(income > 100000) {
        //    className = "First";
        //}else {
        //    className = "Economy";
       // }

       //*****simpler:

       /*int income1 = 1000000;
        String className = "Economy";
        if(income>100000){
            className = "First";
        }*/

       // the simplest - Ternary operator

        int income1 = 1000000;
        String className = income > 1000000 ? "First" : "Economy";  //  shows which flight class will be in classNAme string depending on expression: variable name = expression? false : true

// SWITCH STATEMENTS (INSTEAD OF IF STATEMENTS)




        String role = "admin"; // it is hardcoded here for demonstration but normally it wuold be taken by scanner from user . Giving a user different features depending on the role
        switch(role) {// in the curly braces you have all the case scenarios divided with break
            case "admin": // if role is admin then this is the print out
                System.out.println("You are admin");
                break; // break to jump out of this block
            case "moderator": // if role is modeator
                System.out.println("You are moderator");
                break;
            default://if neither from above scenarios is true then print this:
                System.out.println("You are a guest");   //no need statement as this is the end
        }


        //************COMMON INTERVIEW QUESTION*****************




    }
}

