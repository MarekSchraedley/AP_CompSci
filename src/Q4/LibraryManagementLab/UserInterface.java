package Q4.LibraryManagementLab;
import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        boolean run = true;
        Scanner keyboard = new Scanner(System.in);
        Library myLibrary = new Library();
        while (run == true) {
            System.out.println("(1) Add Book\n(2) Remove Book\n(3) Add Patron\n(4) Remove Patron\n(5) Checkout Book\n(6) Return Book\n(7) Search By Title\n(8) Search By Author");
            int choice = keyboard.nextInt();
            if (choice == 1) {
                System.out.println("Input title, isbn, author");
                Book myBook = new Book(keyboard.next(), keyboard.next(), keyboard.next());
                myLibrary.addBook(myBook);
            }
            if (choice == 2) {
                System.out.println("Input isbn");
                myLibrary.removeBook(keyboard.next());
            }
            if (choice == 3) {
                System.out.println("Input name, patronId");
                Patron myPatron = new Patron(keyboard.next(), keyboard.next());
                myLibrary.addPatron(myPatron);
            }
            if (choice == 4) {
                System.out.println("Input PatronId");
                myLibrary.removePatron(keyboard.next());
            }
        }
    }
}
