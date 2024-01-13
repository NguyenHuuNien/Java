package DeDauLau;

import java.io.Serializable;

public class Book implements Serializable{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book() {
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String s = "Book[name="+this.name+","+this.author.toString()+",price="+this.price+",qty="+this.qty+"]";
        return s;
    }
    
}
