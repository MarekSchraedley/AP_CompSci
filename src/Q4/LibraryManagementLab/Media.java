package Q4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)

    public Media(String myTitle, String myIsbn) {
        title = myTitle;
        isbn = myIsbn;
    }

    // TODO: Implement getter methods
    public String getTitle() {return title;}
    public String getIsbn() {return isbn;}
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
    public boolean getCheckedOut() {return isCheckedOut;}
}
