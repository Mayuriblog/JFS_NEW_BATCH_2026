import java.util.*;

class Transaction {
    String type;
    double amount;
    Date date;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    public String toString() {
        return type + " | ₹" + amount + " | " + date;
    }
}

class Account {
    int accNo;
    String name;
    double balance;
    List<Transaction> history;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    void deposit(double amount) {
        balance += amount;
        history.add(new Transaction("Deposit", amount));
    }

    boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        history.add(new Transaction("Withdraw", amount));
        return true;
    }

    void addTransaction(String type, double amount) {
        history.add(new Transaction(type, amount));
    }
}

public class BankManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Account> accounts = new HashMap<>();

    // -------- CREATE ACCOUNT --------
    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts.put(accNo, new Account(accNo, name, balance));
        System.out.println("Account created successfully!");
    }

    // -------- VIEW ACCOUNT --------
    static void viewAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = accounts.get(accNo);

        if (acc != null) {
            System.out.println("Account No: " + acc.accNo);
            System.out.println("Name: " + acc.name);
            System.out.println("Balance: ₹" + acc.balance);
        } else {
            System.out.println("Account not found!");
        }
    }

    // -------- DEPOSIT --------
    static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = accounts.get(accNo);

        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        acc.deposit(amount);
        System.out.println("Amount deposited!");
    }

    // -------- WITHDRAW --------
    static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = accounts.get(accNo);

        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (acc.withdraw(amount)) {
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // -------- TRANSFER --------
    static void transfer() {
        System.out.print("From Account: ");
        int from = sc.nextInt();

        System.out.print("To Account: ");
        int to = sc.nextInt();

        Account acc1 = accounts.get(from);
        Account acc2 = accounts.get(to);

        if (acc1 == null || acc2 == null) {
            System.out.println("Invalid account!");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (!acc1.withdraw(amount)) {
            System.out.println("Insufficient balance!");
            return;
        }

        acc2.deposit(amount);

        acc1.addTransaction("Transfer to " + to, amount);
        acc2.addTransaction("Transfer from " + from, amount);

        System.out.println("Transfer successful!");
    }

    // -------- TRANSACTION HISTORY --------
    static void transactionHistory() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = accounts.get(accNo);

        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("\n--- Transaction History ---");
        for (Transaction t : acc.history) {
            System.out.println(t);
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> viewAccount();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> transfer();
                case 6 -> transactionHistory();
                case 7 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}