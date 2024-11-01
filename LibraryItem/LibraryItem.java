package LibraryItem;

abstract class LibraryItem {
    protected String id;
    protected String title;
    protected String author;
    protected String ISBN;
    protected String publisher;
    protected int numOfCopies;
    // Constructor for initializing basic info common to all library items
    public LibraryItem(String id, String title, String author, String ISBN, String publisher, int numOfCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
    }
    // Abstract method for each item type to have thier own type label
    public abstract String getType();
    
    // Checks for available copies to borrow
    public boolean isAvailable() {
        return numOfCopies > 0;
    }
}