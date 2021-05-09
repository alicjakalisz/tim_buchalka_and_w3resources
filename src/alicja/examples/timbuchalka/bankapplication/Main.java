package alicja.examples.timbuchalka.bankapplication;

import alicja.examples.timbuchalka.arraylistmobilechallenge.MobilePhone;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Bank bank = new Bank();// only empty list of branches as an attribute while creating new object.
//        Branch branch= new Branch("London");// name to parenthesis but there is also empty customer list
//        Branch branch1= new Branch("Birmingham");
//        bank.addBranch(branch);// adding object branch to the llist of branches which is attribute of bank
//        bank.addBranch(branch1);
//
//        Customer david = new Customer("David", "Virgil", "53466452P");// objec customer, name, last name
//        Customer alicja = new Customer("Alicja", "Gata", "53466453P");
//        Transaction initialDavid = new Transaction(25.0,"2020-04-08");
//        Transaction initialAlicja = new Transaction(50.0,"2020-04-08");
//
//       bank.addCustomer("London","Alicja","Kalisz","12354666",initialAlicja);
//       bank.addCustomer("Birmingham","David","Virgil","12344874",initialDavid);
//
//       bank.addTransaction("12354666","London",new Transaction(135,"20.03.2020"));
//        ArrayList<Transaction> transactionsDavid = bank.getTransactions("53466452P","London");

        Menu menu= new Menu();
        while(menu.chooseMenu()){}
    }
}
