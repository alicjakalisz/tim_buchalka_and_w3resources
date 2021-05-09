package alicja.examples.timbuchalka.bankapplication;

import alicja.examples.timbuchalka.arraylistmobilechallenge.Contact;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Bank bank;

    public Menu() {
        this.bank = new Bank();//creating Menu object with empty bank
    }


    public void printMenu() {

        System.out.println("1.List Branches");
        System.out.println("2.Add Branch to the bank");
        System.out.println("3.Add Customer to the branch");
        System.out.println("4.Add transaction to the customer");
        System.out.println("5.Get List of Customer' Transactions");
        System.out.println("6.Get Customers of the branch");
    }

    public boolean chooseMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option from the menu: ");
        printMenu();
        boolean hasInt = scanner.hasNextInt();
        //dd\n --> if hasInt is a string first you clear the scanner (one operation as will clear the whole string)
        while (!hasInt) {// if hasInt is false (contains string, not int) then it enters to the loop), you need to clear scanner first
            scanner.nextLine();
            System.out.println("You need to type down the number. Choose once again");
            hasInt = scanner.hasNextInt();// you ask again and check if int
        }   //45\n --> first store 45  and n| you clear
        choice = scanner.nextInt();//if above hasInt was actually an integer, first you store this in variable and next you clear scanner
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println(getListBranches());
                break;
            case 2:
                boolean added = addBranch();
                if(!added){
                    System.out.println("Branch was not added");
                }
                else{
                    System.out.println("Succesfully added");
                }
                break;
            case 3:
                added = addCustomerToBranch();
                if(!added){
                    System.out.println("Customer was not added");
                }
                else{
                    System.out.println("Customer succesfully added");
                }
                break;
            case 4:
                added = addTransactionToCustomer();
                if(!added){
                    System.out.println("Transaction was not added");
                }
                else{
                    System.out.println("Transaction succesfully added");
                }
                break;
            case 5:
                System.out.println(getListofCustomersTransactions());
                break;
            case 6:
                System.out.println(getCustomersOfBranch());
                break;

            default:
                System.out.println("Quits the program");
                return false;

        }
        System.out.println();
        return true;

    }

    private ArrayList<Branch> getListBranches() {
        System.out.println("Branches: ");
        return bank.getBranches();
    }

    private boolean addBranch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add new Branch name: ");
        String newBranch = scanner.nextLine();
        Branch branch = new Branch(newBranch);
        return bank.addBranch(branch);
    }

    private boolean addCustomerToBranch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which branch will new customer belong to?: ");
        String branchName = scanner.nextLine();
        System.out.print("Add new customer name: ");
        String newCustomerName = scanner.nextLine();
        System.out.print("Add new customer last name: ");
        String newCustomerLastName = scanner.nextLine();
        System.out.print("Add new customer id: ");
        String newCustomerId = scanner.nextLine();
        System.out.print("What is the initial transaction amount ");
        boolean hasDouble = scanner.hasNextDouble();
        while (!hasDouble) {
            scanner.nextLine();
            System.out.println("Please insert the amount in numeric value");
            hasDouble = scanner.hasNextDouble();
        }
        Double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Transaction date: ");
        String transactionDate = scanner.nextLine();
        Transaction transaction = new Transaction(amount, transactionDate);
        return bank.addCustomer(branchName, newCustomerName, newCustomerLastName, newCustomerId, transaction);
    }


    private boolean addTransactionToCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("What is the initial transaction amount ");
        boolean hasDouble = scanner.hasNextDouble();
        while (!hasDouble) {
            scanner.nextLine();
            System.out.println("Please insert the amount in numeric value");
            hasDouble = scanner.hasNextDouble();
        }
        Double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Transaction date: ");
        String transactionDate = scanner.nextLine();
        Transaction transaction = new Transaction(amount, transactionDate);
        System.out.print("Which branch will new customer belong to?: ");
        String branchName = scanner.nextLine();

        return bank.addTransaction(customerId, branchName, transaction);

    }

    private ArrayList<Transaction> getListofCustomersTransactions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Branch Name:");
        String branchName = scanner.nextLine();
        System.out.println("Customer ID");
        String customerID = scanner.nextLine();
        return bank.getTransactions(customerID, branchName);
    }


    private ArrayList<Customer> getCustomersOfBranch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the branch: ");
        String branchName = scanner.nextLine();
        return bank.getCustomers(branchName);
    }


}
