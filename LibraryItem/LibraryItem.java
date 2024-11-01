abstract class LibraryItem {
    protected String id;
    protected String title;
    protected String author;
    protected String ISBN;
    protected String publisher;
    protected int numOfCopies;

    public LibraryItem(String id, String title, String author, String ISBN, String publisher, int numOfCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
    }
    public abstract String getType();
    public boolean isAvailable() {
        return numOfCopies > 0;
    }
}