package LibraryItem;

import java.util.ArrayList;

class Author {
    private String name, dateOfBirth;
    private ArrayList<LibraryItem> items;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }
}