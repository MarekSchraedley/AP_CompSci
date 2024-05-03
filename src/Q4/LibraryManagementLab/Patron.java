package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)

    public Patron(String myName, String myPatronId) {
        name = myName;
        patronId = myPatronId;
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }
    public ArrayList<Book> getCheckedOutBooks() { return checkedOutBooks; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    public void checkInBook(Book book) {
        checkedOutBooks.remove(book);
        book.setCheckedOut(false);

    }

    public void checkOutBook(Book book) {
        checkedOutBooks.add(book);
        book.setCheckedOut(true);
    }
    // Don't forget to set the book's checkedOut field to true/false
}
