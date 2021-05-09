package alicja.examples.singapour.authorandbooks;

public class Book {
    private String name;
    private Author author; // field of type Author
    private double price;
    private int qty;

    public Book(String name, Author author,double price){
        this(name,author,price,11);

    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
}
