// Book
class Book {

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Member function to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    // Member function to change the book title
    public void setTitle(String newTitle) {
        title = newTitle;
    }
}

// Library
class Library {

    private String libraryName;
    private int totalBooks;

    // Constructor
    public Library(String libraryName, int totalBooks) {
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
    }

    // Member function to display library details
    public void displayLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
    }

    // Member function to add books to the library
    public void addBooks(int count) {
        totalBooks += count;
        System.out.println(count + " books added to the library.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Book class
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book1.displayDetails();
        book1.setTitle("The Great Gatsby - Updated Edition");
        book1.displayDetails();

        // Library class
        Library library = new Library("City Library", 500);
        library.displayLibraryInfo();
        library.addBooks(50);
        library.displayLibraryInfo();
    }
}
