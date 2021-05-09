package alicja.examples.timbuchalka.bankapplication;

import java.util.ArrayList;

public class Branch {// 1 branch with list of customers under this branch
    private String name;
    private ArrayList<Customer> customers;// each branch (object) has a list of customers

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean addCustomer(Customer customer, Transaction initialAmount){
        // add customer to the branch
        for (Customer client: customers){
            if(client.getId().toLowerCase().equals(customer.getId().toLowerCase())){
                return false;
            }
        }
        customer.addTransaction(initialAmount);
        return customers.add(customer);
    }
    public boolean addTransaction(String customerId, Transaction transaction){
            //list of transactions is inside of Customer Class
        for (Customer c: customers){// looping through customers lists in Branch class (attribute)
            if(c.getId().toLowerCase().equals(customerId.toLowerCase())){// checking if this customer exists in Customer list customers by id attribute.
                return c.addTransaction(transaction);
            }
        }
        return false;
    }

    public ArrayList<Transaction> getTransactionsByCustomerId(String customerId){
        for(Customer c: customers){
            if(c.getId().toLowerCase().equals(customerId.toLowerCase())){
                return c.getTransactions();
            }
        }
        return new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
