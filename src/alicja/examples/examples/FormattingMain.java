package alicja.examples.examples;


import java.text.NumberFormat;
import java.util.Scanner;

public class FormattingMain {

    public static void main (String[] args) {
        System.out.println("David ");


        String a = "fdsafdsafdsafsd";
        System.out.println(a.endsWith("sddd"));

//********************* FORMATING NUMBERS****************************************
        // CONVERTING NUMBER INTO CURRENCY*************************
        NumberFormat currency = NumberFormat.getCurrencyInstance();
// creating object currency using class NumberFormat but withoiut new operator as this is abstract class.
// Instead we need to use Class method getCurrencyInstance() (factory method as it creates new objects) to get initalize this object , there will be memory allocated but we no value right now as this is utlity class
        //once we use on this object method of this classs "format" we can input number. To get this number printed, we can out it in parethensis of SOAT or
        // first assign it to "result# variable and print
        String result= currency.format(4646464645.8989);
        System.out.println(result);


//CONVERTING NUMBER INTO PERCENTAGE *******************************************

        NumberFormat percentage = NumberFormat.getPercentInstance(); // we have created an instance/object percentage of class NumberFormat
        String resultOfpercentage =percentage.format(0.234); // we assigned out of the method to the variable to store it in the memory, otherwise it is not stored, we can only print it .
        System.out.println(resultOfpercentage);


        //HOW TO CHANGE OBJECT/VARIABLE NAME ACROSS WHOLE CODE - do not do it manually, highlight the variabke able SHIFT + F6 and give a new name to it.


        // SHOrt cut for formatting numbers: first we are using NumberFormat Class which is abstract class and has only methods which create instances.
        // Instance is created but not named (instrad of new operator), then after dot, you have all the methods assigned to this object
        // (as this is converting function you have a different type for input and it returns different output type so you need to assigin it to the variable of the same time as output),
        String result3= NumberFormat.getPercentInstance().format(0.7675).concat("DAvid");
        System.out.println(result3);


        //**********INPUT FROM THE USER********************
        //we have created object scanner using java class Scanner and in the parenthesis you need to show from which place we are going to read the input- from terminal, from file,
        //to work with terminal window we put System.in (in is inputstream and it is one of fields in the system class. System.Out is used to print something on the terminal
        Scanner scanner = new Scanner(System.in); // OBJECT created without any functions yet. Object has been created and assigned to variable type reference , name scanner.
        //lets print out the questions: Age
        System.out.println("Age:");

        //now we need to give some role to the object - an object scanner has a bunch of methods, we use nextByte, so the scanner will read input from terminal in Byte type (whole number)
        scanner.nextByte(); //object with a function next that will take byte user input
        //at this stage we could print it out the message but it would be nowhere so having this object , it is good to assisng it to some variable to store the input it in the memory.
        //OBJECT CREATED IS NOT STORED IN MEMORY UNLESS YOU ASSIGN IT TO THE VARIABLE.
        byte age = scanner.nextByte(); // variable type prmitive byte name age created for result of the function of the object, you are ASSIGNING the result of the function (nextByte)
        System.out.println("You are" + age); // answer from the user printed out


        Scanner scanner1 = new Scanner(System.in); // object created and assignrf to variable type reference under name scanner
        System.out.print("Name: "); //question printed
        String name = scanner1.nextLine().trim(); //result of function, what function returnes assigned to reference type String function chosen nextline (returns strings- more than 1 token= 1 word,
        // for 1 word we use next) . WE need to create variable name to store the answer. we also want to get rid of spaces so next function is trimm
        System.out.print( "You are" + name);











    }
}
