package se.dsve;

public class BookTest {
    private String title;
    private String author;
    private double price;

    public BookTest(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price + " kr\n");
    }

    public void addDiscount(int percentage){
        price *= 1 - (percentage * 0.01);
    }
}
