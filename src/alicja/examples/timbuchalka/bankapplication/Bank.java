package alicja.examples.timbuchalka.bankapplication;

import oop2.A;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();// list of branches initially is empty (when you create bank object)
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    //METHOD add object Branch to the list of branches
    public boolean addBranch(Branch a){// adding another branch to the list of branches checking if addition has been done sucessfully
        for (Branch branch: branches){// enhanced loop that goes through each element of the branches to check if one of branches is equal to a
            if(branch.getName().equals(a.getName())){
                return false;// if a branch that we want to add to the list of branches already exists, we need to return false
            }
        }
        branches.add(a);// adding new branch to the list of brannches ATRIBUTE OF BANK (branches list) has a method add branch.
        return true;
    }

    public boolean addCustomer(String branchName, String name, String lastName, String id, Transaction initialTransaction ){
        Customer customer= new Customer(name,lastName,id);//we are creating object of class Customer (using parameteres name and last name and id)
        // as below we will use branch class method to add customer
        for (Branch branch: branches){//we are checking if branch that we pass through as a parameters exists in list of branches(checking by name attribute)
            if(branch.getName().toLowerCase().equals(branchName.toLowerCase())){
               return branch.addCustomer(customer,initialTransaction);// passing responsability to the branch from bank.
                // Branch has a method add customer as well and it will be executed there.
            }
        }
        return false;
    }
    public boolean addTransaction (String customerID, String branchName, Transaction transaction){// adding transaction object vvia bank class for the certain customer of certain branch
        for(Branch branch: branches){
            if(branch.getName().toLowerCase().equals(branchName.toLowerCase())){
                return branch.addTransaction(customerID,transaction);// in bank we are using branch object to add transaction
            }
        }
        return false;

    }
    public ArrayList<Customer> getCustomers(String branchName){
        for(Branch branch: branches){
            if(branch.getName().toLowerCase().equals(branchName.toLowerCase())){
                return branch.getCustomers();
            }
        }
        return new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactions(String customerID, String branchName){
        for(Branch branch: branches){
            if(branch.getName().toLowerCase().equals(branchName.toLowerCase())){
                return branch.getTransactionsByCustomerId(customerID);
            }
        }
        return new ArrayList<>();
    }
}
