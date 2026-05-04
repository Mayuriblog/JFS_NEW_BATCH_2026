import java.util.*;

class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

class IssueRecord {
    int bookId;
    String studentName;
    int issueDay;

    IssueRecord(int bookId, String studentName, int issueDay) {
        this.bookId = bookId;
        this.studentName = studentName;
        this.issueDay = issueDay;
    }
}

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Book> books = new HashMap<>();
    static Map<Integer, IssueRecord> issuedBooks = new HashMap<>();

    // -------- ADD BOOK --------
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(id)) {
            System.out.println("Book already exists!");
            return;
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.put(id, new Book(id, title, author));
        System.out.println("Book added!");
    }

    // -------- VIEW BOOKS --------
    static void viewBooks() {
        System.out.println("\n--- All Books ---");
        for (Book b : books.values()) {
            System.out.println(b.id + " | " + b.title +
                    " | " + b.author +
                    " | " + (b.isIssued ? "Issued" : "Available"));
        }
    }

    // -------- SEARCH --------
    static void searchBook() {
        System.out.print("Enter ID or Title: ");
        String input = sc.nextLine();

        boolean found = false;

        for (Book b : books.values()) {
            if (String.valueOf(b.id).equals(input) ||
                b.title.equalsIgnoreCase(input)) {

                System.out.println(b.id + " | " + b.title +
                        " | " + b.author +
                        " | " + (b.isIssued ? "Issued" : "Available"));
                found = true;
            }
        }

        if (!found)
            System.out.println("Book not found!");
    }

    // -------- ISSUE BOOK --------
    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Book b = books.get(id);

        if (b == null) {
            System.out.println("Book not found!");
            return;
        }

        if (b.isIssued) {
            System.out.println("Book already issued!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Issue Day (1-30): ");
        int day = sc.nextInt();

        b.isIssued = true;
        issuedBooks.put(id, new IssueRecord(id, name, day));

        System.out.println("Book issued!");
    }

    // -------- RETURN BOOK --------
    static void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = books.get(id);
        IssueRecord record = issuedBooks.get(id);

        if (b == null || record == null) {
            System.out.println("Invalid book!");
            return;
        }

        System.out.print("Enter Return Day: ");
        int returnDay = sc.nextInt();

        int days = returnDay - record.issueDay;

        // Fine: ₹10 per day after 7 days
        int fine = 0;
        if (days > 7) {
            fine = (days - 7) * 10;
        }

        b.isIssued = false;
        issuedBooks.remove(id);

        System.out.println("Book returned!");
        System.out.println("Days kept: " + days);
        System.out.println("Fine: ₹" + fine);
    }

    // -------- VIEW ISSUED --------
    static void viewIssuedBooks() {
        System.out.println("\n--- Issued Books ---");
        for (IssueRecord r : issuedBooks.values()) {
            System.out.println("Book ID: " + r.bookId +
                    " | Student: " + r.studentName +
                    " | Issue Day: " + r.issueDay);
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        // Preload books
        books.put(1, new Book(1, "Java Basics", "James"));
        books.put(2, new Book(2, "Data Structures", "Mark"));
        books.put(3, new Book(3, "Algorithms", "CLRS"));

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Issued Books");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> searchBook();
                case 4 -> issueBook();
                case 5 -> returnBook();
                case 6 -> viewIssuedBooks();
                case 7 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}