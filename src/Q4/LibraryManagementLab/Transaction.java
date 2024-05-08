package Q4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default

    public Transaction(String myIsbn, String myPatronId, String myCheckoutDate) {
        isbn = myIsbn;
        patronId = myPatronId;
        checkoutDate = myCheckoutDate;
    }

    // TODO: Implement getters and setters
    public String getIsbn() {return isbn;}
    public String getPatronId() {return patronId;}
    public String getCheckoutDate() {return checkoutDate;}
    public void setCheckoutDate(String myCheckoutDate) {checkoutDate = myCheckoutDate;}


    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
