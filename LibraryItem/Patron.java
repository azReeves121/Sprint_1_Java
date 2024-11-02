package LibraryItem;

import java.util.ArrayList;

class Patron {
    private String name;
    private String  address; 
    private String phoneNumber;
    private ArrayList<LibraryItem> borrowedItems;

    // Constructor to set up a patron's info
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    // Borrow if available
    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            borrowedItems.add(item);
            item.borrowItem();
        } else {
            System.out.println("Item not available.");
        }
    }

    // Return to the library
    public void returnItem(LibraryItem item) {
        if (borrowedItems.contains(item)) {
            borrowedItems.remove(item);
            item.returnItem();
        } else {
            System.out.println("Item not found in borrowed list.");
        }
    }
}