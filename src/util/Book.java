//Класс "Книга" моделирует книгу единственного автора.
package util;

public class Book {
    //private переменные-члены класса
    private String name;
    private Author author;
    private double price;
    private int qty;

    //Конструктор
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    //Геттеры и сеттеры
    public String getName(){
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName() {
        this.name=name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "'"+name+"'-"+author;
    }
}
