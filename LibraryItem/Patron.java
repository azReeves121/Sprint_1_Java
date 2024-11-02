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
    // public void borrowItem(LibraryItem item) {
    //     if (item.isAvailable()) {
    //         borrowedItems.add(item);
    //         item.borrowItem();
    //     } else {
    //         System.out.println("Item not available.");
    //     }
    // }
    public void borrowItem(Patron patron, String title) {
        LibraryItem item = searchItemByTitle(title);
        if (item != null && item.numOfCopies > 0 && item.getStatus() == Status.AVAILABLE) {
            patron.borrowItem(item);
            item.numOfCopies--;
            item.setStatus(Status.CHECKED_OUT); // Change status
            System.out.println("Item borrowed successfully.");
        } else {
            System.out.println("Item is not available.");
        }
    }

    // Return to the library
    // public void returnItem(LibraryItem item) {
    //     if (borrowedItems.contains(item)) {
    //         borrowedItems.remove(item);
    //         item.returnItem();
    //     } else {
    //         System.out.println("Item not found in borrowed list.");
    //     }

    }

    public void returnItem(Patron patron, String title) {
        LibraryItem item = searchItemByTitle(title);
        if (item != null && patron.borrowedItems.contains(item)) {
            patron.returnItem(item);
            item.numOfCopies++;
            item.setStatus(item.numOfCopies > 0 ? Status.AVAILABLE : Status.CHECKED_OUT); // Set status
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("Item not found in borrowed items.");
        }
    }




}
