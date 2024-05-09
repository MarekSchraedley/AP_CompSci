package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class BinarySearchUtil {
    public BinarySearchUtil(){};
    // TODO: Implement binary search method (takes in ArrayList) using recursion for searching books by title (required) or author
    public Book binarySearchTitle(ArrayList<Book> books, String target) {
        ArrayList<Book> sublist = new ArrayList<>();
        if (target.equals(books.get(books.size()/2).getTitle())) {
            return books.get(books.size()/2);
        }
        else if (books.size() == books.size()/2) {
            return books.get(0);
        }
        else if (target.compareTo(books.get(books.size()/2).getTitle()) < 0) {
            for (int lcv = 0; lcv < (books.size()/2); lcv++) {
                sublist.add(books.get(lcv));
            }
        }
        else {
            for (int lcv = books.size()/2 + 1; lcv < (books.size()); lcv++) {
                sublist.add(books.get(lcv));
            }
        }
        return binarySearchTitle(sublist, target);
    }

    public Book binarySearchAuthor(ArrayList<Book> books, String target) {
        ArrayList<Book> sublist = new ArrayList<>();
        if (target.equals(books.get(books.size()/2).getAuthor())) {
            return books.get(books.size()/2);
        }
        else if (books.size() == books.size()/2) {
            return books.get(0);
        }
        else if (target.compareTo(books.get(books.size()/2).getAuthor()) < 0) {
            for (int lcv = 0; lcv < (books.size()/2); lcv++) {
                sublist.add(books.get(lcv));
            }
        }
        else if (target.compareTo(books.get(books.size()/2).getAuthor()) > 0) {
            for (int lcv = books.size()/2 + 1; lcv < (books.size()); lcv++) {
                sublist.add(books.get(lcv));
            }
        }
        return binarySearchAuthor(sublist, target);
    }
}
