import java.util.*;

class Room {
    int roomId;
    String type; // Single / Double
    double pricePerDay;
    boolean isBooked;

    Room(int roomId, String type, double pricePerDay) {
        this.roomId = roomId;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.isBooked = false;
    }
}

class Booking {
    int bookingId;
    String customerName;
    Room room;
    int days;
    double totalAmount;

    Booking(int bookingId, String customerName, Room room, int days) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.room = room;
        this.days = days;
        this.totalAmount = days * room.pricePerDay;
    }
}

public class HotelBookingSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Room> rooms = new HashMap<>();
    static Map<Integer, Booking> bookings = new HashMap<>();
    static int bookingCounter = 1;

    // -------- ADMIN --------
    static void addRoom() {
        System.out.print("Enter Room ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Room Type (Single/Double): ");
        String type = sc.nextLine();

        System.out.print("Enter Price per Day: ");
        double price = sc.nextDouble();

        rooms.put(id, new Room(id, type, price));
        System.out.println("Room added successfully!");
    }

    // -------- VIEW --------
    static void viewAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room r : rooms.values()) {
            if (!r.isBooked) {
                System.out.println(r.roomId + " | " + r.type + " | ₹" + r.pricePerDay);
            }
        }
    }

    // -------- BOOK --------
    static void bookRoom() {
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        viewAvailableRooms();

        System.out.print("Enter Room ID to book: ");
        int roomId = sc.nextInt();

        Room room = rooms.get(roomId);

        if (room == null || room.isBooked) {
            System.out.println("Room not available!");
            return;
        }

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        sc.nextLine();

        room.isBooked = true;

        Booking booking = new Booking(bookingCounter++, name, room, days);
        bookings.put(booking.bookingId, booking);

        System.out.println("Booking successful!");
        System.out.println("Booking ID: " + booking.bookingId);
        System.out.println("Total Amount: ₹" + booking.totalAmount);
    }

    // -------- CANCEL --------
    static void cancelBooking() {
        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();

        Booking booking = bookings.get(id);

        if (booking == null) {
            System.out.println("Invalid booking ID!");
            return;
        }

        booking.room.isBooked = false;
        bookings.remove(id);

        System.out.println("Booking cancelled!");
    }

    // -------- VIEW BOOKINGS --------
    static void viewBookings() {
        System.out.println("\n--- All Bookings ---");
        for (Booking b : bookings.values()) {
            System.out.println("ID: " + b.bookingId +
                    " | Name: " + b.customerName +
                    " | Room: " + b.room.roomId +
                    " | Days: " + b.days +
                    " | Amount: ₹" + b.totalAmount);
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {
        // Preload some rooms
        rooms.put(101, new Room(101, "Single", 1000));
        rooms.put(102, new Room(102, "Double", 1800));
        rooms.put(103, new Room(103, "Single", 1200));

        while (true) {
            System.out.println("\n=== Hotel Booking System ===");
            System.out.println("1. Add Room (Admin)");
            System.out.println("2. View Available Rooms");
            System.out.println("3. Book Room");
            System.out.println("4. Cancel Booking");
            System.out.println("5. View Bookings");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addRoom();
                case 2 -> viewAvailableRooms();
                case 3 -> bookRoom();
                case 4 -> cancelBooking();
                case 5 -> viewBookings();
                case 6 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}