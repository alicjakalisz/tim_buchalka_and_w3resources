package alicja.examples.singapour;

public class Account {

    private String id;
    private String name;
    private int balance;


    public Account(String id, String name) {
        this(id,name,0);
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        int newBalance= balance+amount;
        return newBalance;
    }

    public int debit(int amount){
        if(amount>balance){
            System.out.println("Amount exceeded");
            return -1;
        }
        else{
            int newBalance=balance-amount;
            return newBalance;
        }

    }
    public int transferTo(Account another, int amount){
        int balanceofAnother=-1;
        if(amount>balance){
            System.out.println("Amount exceeded");

        }else {
            balanceofAnother=another.balance+amount;
        }
        return balanceofAnother;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}


