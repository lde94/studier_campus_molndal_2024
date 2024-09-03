package se.dsve;


public class Library {

    public se.dsve.Book getBook(String bookTitle) {
        Book book = new Book(bookTitle);
        return book;
    }
}
