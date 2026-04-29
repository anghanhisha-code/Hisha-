// Custom Exception Class
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library Class
class Library {
    private int availableBooks;

    // Constructor
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Method to issue books
    public void issueBook(int count) throws BookNotAvailableException {

        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println(count + " book(s) issued successfully.");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main class
public class LibraryTest {
    public static void main(String[] args) {

        // Initialize library with 3 books
        Library lib = new Library(3);

        try {
            // First request (valid)
            System.out.println("Issuing 2 books...");
            lib.issueBook(2);

            // Second request (invalid, should throw exception)
            System.out.println("\nIssuing 2 more books...");
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nProgram execution completed.");
    }
}
