package LibraryItem;

class Periodical extends LibraryItem {
    private String type; 

     // Constructor for adding a specific type to Periodicals
    public Periodical(String id, String title, String author, String ISBN, String publisher, int numOfCopies, String type) {
        super(id, title, author, ISBN, publisher, numOfCopies);
        this.type = type;
    }
    // a Periodical with its type
    public String getType() {
        return "Periodical (" + type + ")";
    }
}