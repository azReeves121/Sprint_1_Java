package LibraryItem;

class Book extends LibraryItem {
    private String format; // Options: "Printed", "Electronic", "Audio"

    public Book(String id, String title, String author, String ISBN, String publisher, int numOfCopies, String format) {
        super(id, title, author, ISBN, publisher, numOfCopies);
        this.format = format;
    }

    public String getType() {
        return "Book (" + format + ")";
    }
}
