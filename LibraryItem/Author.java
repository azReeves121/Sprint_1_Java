package LibraryItem;

import java.util.ArrayList;

class Author {
    private String name;
    private String dateOfBirth; 
    private ArrayList<LibraryItem> items;
    // Constructor for name and date of birth
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.items = new ArrayList<>();
    }
    // Add item written by the author
    public void addItem(LibraryItem item) {
        items.add(item);
    }
}