import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Product> inventory = new HashMap<>();

    // -------- ADD PRODUCT --------
    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (inventory.containsKey(id)) {
            System.out.println("Product ID already exists!");
            return;
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        inventory.put(id, new Product(id, name, qty, price));
        System.out.println("Product added successfully!");
    }

    // -------- VIEW PRODUCTS --------
    static void viewProducts() {
        System.out.println("\n--- Inventory ---");
        for (Product p : inventory.values()) {
            System.out.println(p.id + " | " + p.name + 
                               " | Qty: " + p.quantity + 
                               " | ₹" + p.price);
        }
    }

    // -------- UPDATE PRODUCT --------
    static void updateProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Product p = inventory.get(id);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        p.name = sc.nextLine();

        System.out.print("Enter New Quantity: ");
        p.quantity = sc.nextInt();

        System.out.print("Enter New Price: ");
        p.price = sc.nextDouble();

        System.out.println("Product updated!");
    }

    // -------- DELETE PRODUCT --------
    static void deleteProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (inventory.remove(id) != null) {
            System.out.println("Product deleted!");
        } else {
            System.out.println("Product not found!");
        }
    }

    // -------- SEARCH PRODUCT --------
    static void searchProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = inventory.get(id);

        if (p != null) {
            System.out.println(p.id + " | " + p.name +
                               " | Qty: " + p.quantity +
                               " | ₹" + p.price);
        } else {
            System.out.println("Product not found!");
        }
    }

    // -------- STOCK IN --------
    static void stockIn() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = inventory.get(id);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter quantity to add: ");
        int qty = sc.nextInt();

        p.quantity += qty;
        System.out.println("Stock updated!");
    }

    // -------- STOCK OUT --------
    static void stockOut() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = inventory.get(id);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter quantity to remove: ");
        int qty = sc.nextInt();

        if (qty > p.quantity) {
            System.out.println("Not enough stock!");
            return;
        }

        p.quantity -= qty;
        System.out.println("Stock updated!");
    }

    // -------- LOW STOCK ALERT --------
    static void lowStockAlert() {
        System.out.println("\n--- Low Stock (Qty < 5) ---");
        for (Product p : inventory.values()) {
            if (p.quantity < 5) {
                System.out.println(p.name + " (Qty: " + p.quantity + ")");
            }
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        // Preload some products
        inventory.put(1, new Product(1, "Laptop", 10, 55000));
        inventory.put(2, new Product(2, "Mouse", 25, 500));
        inventory.put(3, new Product(3, "Keyboard", 5, 1200));

        while (true) {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product");
            System.out.println("6. Stock In");
            System.out.println("7. Stock Out");
            System.out.println("8. Low Stock Alert");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> viewProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> searchProduct();
                case 6 -> stockIn();
                case 7 -> stockOut();
                case 8 -> lowStockAlert();
                case 9 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}