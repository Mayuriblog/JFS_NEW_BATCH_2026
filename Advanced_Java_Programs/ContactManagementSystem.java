import java.util.*;

class Contact {
    int id;
    String name;
    String phone;
    String email;

    Contact(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class ContactManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Contact> contacts = new HashMap<>();
    static int idCounter = 1;

    // -------- ADD CONTACT --------
    static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        // Check duplicate phone
        for (Contact c : contacts.values()) {
            if (c.phone.equals(phone)) {
                System.out.println("Phone number already exists!");
                return;
            }
        }

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.put(idCounter, new Contact(idCounter, name, phone, email));
        System.out.println("Contact added! ID: " + idCounter);
        idCounter++;
    }

    // -------- VIEW CONTACTS --------
    static void viewContacts() {
        System.out.println("\n--- All Contacts ---");
        for (Contact c : contacts.values()) {
            System.out.println(c.id + " | " + c.name + 
                               " | " + c.phone + 
                               " | " + c.email);
        }
    }

    // -------- SEARCH --------
    static void searchContact() {
        System.out.print("Enter name or phone: ");
        String input = sc.nextLine();

        boolean found = false;

        for (Contact c : contacts.values()) {
            if (c.name.equalsIgnoreCase(input) || c.phone.equals(input)) {
                System.out.println(c.id + " | " + c.name + 
                                   " | " + c.phone + 
                                   " | " + c.email);
                found = true;
            }
        }

        if (!found)
            System.out.println("Contact not found!");
    }

    // -------- UPDATE --------
    static void updateContact() {
        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Contact c = contacts.get(id);

        if (c == null) {
            System.out.println("Contact not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        c.name = sc.nextLine();

        System.out.print("Enter New Phone: ");
        String newPhone = sc.nextLine();

        // Check duplicate phone
        for (Contact other : contacts.values()) {
            if (other.phone.equals(newPhone) && other.id != id) {
                System.out.println("Phone number already exists!");
                return;
            }
        }

        c.phone = newPhone;

        System.out.print("Enter New Email: ");
        c.email = sc.nextLine();

        System.out.println("Contact updated!");
    }

    // -------- DELETE --------
    static void deleteContact() {
        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();

        if (contacts.remove(id) != null) {
            System.out.println("Contact deleted!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    // -------- SORT --------
    static void sortContacts() {
        List<Contact> list = new ArrayList<>(contacts.values());

        list.sort(Comparator.comparing(c -> c.name.toLowerCase()));

        System.out.println("\n--- Sorted Contacts ---");
        for (Contact c : list) {
            System.out.println(c.id + " | " + c.name + 
                               " | " + c.phone + 
                               " | " + c.email);
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Contact Management System ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Sort Contacts (A-Z)");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> sortContacts();
                case 7 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}