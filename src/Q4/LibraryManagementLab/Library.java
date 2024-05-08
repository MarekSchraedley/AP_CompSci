package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor
    public Library() {}
    // Implement interface methods
    @Override
    public void addBook(Book book) { /* Implementation; remember to add in sorted order */
        int lcv = 0;
        boolean bookFound = false;
        while (lcv < books.size() && bookFound != true) {
            if (book.getTitle().compareTo(books.get(lcv).getAuthor()) > 0) {
                bookFound = true;
            }
            lcv++;

        }
        books.add(lcv, book);
    }
    @Override
    public void removeBook(String isbn) {

    }
    // Other methods...
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    public void removePatron(String patronId) {
        for (int lcv = 0; lcv < patrons.size(); lcv++) {
            if (patrons.get(lcv).getPatronId().equals(patronId)) {
                patrons.remove(lcv);
                lcv--;
            }
        }
    }
    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        transactions.add(new Transaction(isbn, patronId, checkoutDate));
    }

    public void updateTransaction(Transaction t, String isbn, String patronId, String returnDate) {
        t.setCheckoutDate(returnDate);
    }

    public boolean checkoutBook(String isbn, String patronId) {
        boolean checkedOut = false;
        for (int lcv = 0; lcv < patrons.size(); lcv++) {
            if (patrons.get(lcv).getPatronId().equals(patronId)) {
                for (int lcv2 = 0; lcv2 < books.size(); lcv2++) {
                    if (books.get(lcv2).getIsbn().equals(isbn)) {
                        if (!books.get(lcv2).getCheckedOut()); {
                            patrons.get(lcv).checkOutBook(books.get(lcv2));
                            checkedOut = true;
                        }
                    }
                }
            }
        }
        return checkedOut;
    }

    public boolean checkinBook(String isbn, String patronId) {
        boolean checkedIn = false;
        for (int lcv = 0; lcv < patrons.size(); lcv++) {
            if (patrons.get(lcv).getPatronId().equals(patronId)) {
                for (int lcv2 = 0; lcv2 < books.size(); lcv2++) {
                    if (books.get(lcv2).getIsbn().equals(isbn)) {
                        if (books.get(lcv2).getCheckedOut()); {
                            patrons.get(lcv).checkInBook(books.get(lcv2));
                            checkedIn = true;
                        }
                    }
                }
            }
        }
        return checkedIn;
    }

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
        boolean transactionFound = false;
        for (int lcv = transactions.size(); lcv >= 0; lcv--) {
            if (transactions.get(lcv).getIsbn().equals(isbn) && transactionFound == false) {
                System.out.println("The most recent transaction was done by this patron: " + transactions.get(lcv).getPatronId());
                transactionFound = true;
            }
        }
        if (transactionFound == false) {
            System.out.println("No transactions found for ISBN: " + isbn);
        }
    }

    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
            if (title.toLowerCase().contains(book.getTitle().toLowerCase())) {
                return book;
            }
        }
        return books.get(0);
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        BinarySearchUtil b = new BinarySearchUtil();
        return b.binarySearchTitle(books, title);
    }

    public Book searchBookByAuthor(String author) {
        // TODO: Binary search for book; if not found, return the closest book
        BinarySearchUtil b = new BinarySearchUtil();
        return b.binarySearchTitle(books, author);
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
