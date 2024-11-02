package LibraryItem;

import java.util.ArrayList;
import java.util.Scanner;

// Menu class to interact with the library management system
class LibraryMenu {
    private ArrayList<LibraryItem> items = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<Patron> patrons = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Displays the main menu
    public void displayMenu() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Library Item");
            System.out.println("2. Edit Library Item");
            System.out.println("3. Delete Library Item");
            System.out.println("4. Add Author");
            System.out.println("5. Add Patron");
            System.out.println("6. Borrow Item");
            System.out.println("7. Return Item");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
            switch (choice) {
                case 1: addLibraryItem(); break;
                case 2: editLibraryItem(); break;
                case 3: deleteLibraryItem(); break;
                case 4: addAuthor(); break;
                case 5: addPatron(); break;
                case 6: borrowItem(); break;
                case 7: returnItem(); break;
                case 8: System.exit(0);
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Adds a new library item based on user input
    private void addLibraryItem() {
        System.out.print("Enter item ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter number of copies: ");
        int numOfCopies = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter item type (Book/Periodical): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Book")) {
            System.out.print("Enter format (Printed/Electronic/Audio): ");
            String format = scanner.nextLine();
            items.add(new Book(id, title, author, isbn, publisher, numOfCopies, format));
        } else if (type.equalsIgnoreCase("Periodical")) {
            System.out.print("Enter periodical type (Printed/Electronic): ");
            String periodicalType = scanner.nextLine();
            items.add(new Periodical(id, title, author, isbn, publisher, numOfCopies, periodicalType));
        } else {
            System.out.println("Invalid type.");
        }
    }

    private void editLibraryItem() {
        System.out.print("Enter item ID to edit: ");
        String id = scanner.nextLine();
        
    }

    private void deleteLibraryItem() {
        System.out.print("Enter item ID to delete: ");
        String id = scanner.nextLine();
        
    }

    private void addAuthor() {
        System.out.print("Enter author's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date of birth: ");
        String dob = scanner.nextLine();
        authors.add(new Author(name, dob));
    }

    private void addPatron() {
        System.out.print("Enter patron's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        patrons.add(new Patron(name, address, phoneNumber));
    }

    private void borrowItem() {
        System.out.print("Enter patron name: ");
        String patronName = scanner.nextLine();
        System.out.print("Enter item ID to borrow: ");
        String itemId = scanner.nextLine();
        
    }

    private void returnItem() {
        System.out.print("Enter patron name: ");
        String patronName = scanner.nextLine();
        System.out.print("Enter item ID to return: ");
        String itemId = scanner.nextLine();
        
    }
}