package se.dsve;

public class Book {

   String title;
   String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title) {
        this(title, "unknown");
    }

}
