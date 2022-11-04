package book;

import author.*;
// Done
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public String toString() {
        String[] authorInfArray = new String[authors.length];
        for(int i = 0; i < authors.length; i++) {
            authorInfArray[i] = authors[i].toString();
        }
        
        return String.format("Book[name=%s,authors={%s},price=%f,qty=%d]", 
                            name, String.join(",", authorInfArray), price, qty);
    }
}