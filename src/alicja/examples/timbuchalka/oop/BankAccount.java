package alicja.examples.timbuchalka.oop;

import oop2.B;

public class BankAccount {

    //account number, balance, customer name, email, phone number
    //getters and setters

    //attributes:
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


                                //constructors:

    //1.EMPTY: default constructors - normally is empty if you dont create it in the class, all values null or 0;

    //2.HARCODED but you can create default constructor with values of fields(attributes) assigned (hardcoded)
    public BankAccount(){
        this(1356546,5464,"Default Name","default email address",5454);
    }
//so if you dont put any parameters in brackets the constructor will create an object with above values of the state.
//you can later use method set to overwrite them


    //3.VALUES PARSED IN PARAMETERS: constructor where during creating new object you will be able to pass value of fields(attributes) in the parameters
    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    //4.Constructor - HYBRID partly hardcoded

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(16467987,100,customerName,email,phoneNumber);
    }

    //methods:
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double funds){
        this.balance=balance+funds;
        System.out.println("Deposit of "+funds+" made.The currrent balance is: "+balance);
    }
    public void withdrawFunds(double funds){
        if(funds>balance){
            System.out.println("Insufficient balance");
        }else
        this.balance=balance-funds;
        System.out.println("Witdrawal of "+funds+" was made. The remaining balance is "+balance);
    }

}
