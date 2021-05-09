package alicja.examples.timbuchalka.bankapplication;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String lastName;
    private String id;
    private ArrayList<Transaction> transactions;

    public Customer(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.transactions= new ArrayList<>();// initially empty list of transactions
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public boolean addTransaction( Transaction transaction){
        return transactions.add(transaction);// add element to the list
    }
}
