public class Book {
    String title;
    String author;
    int pages;
    String genre;

    void bookInfo () {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    void howLong(int pagesToRead) {

        int days = pages / pagesToRead;
        System.out.println("It will take about " + days + " days to finish the book.");

    }
            void checkGenre(String genreCheck) {
           String lowerCaseGenre = genre.toLowerCase();
           String lowerCaseGenreInput = genreCheck.toLowerCase();


           if (lowerCaseGenreInput.equals(lowerCaseGenre)) {
               System.out.println(lowerCaseGenre + ": " + lowerCaseGenreInput);
           }
           else {S
               System.out.println("No match.");
           }

       }
}


