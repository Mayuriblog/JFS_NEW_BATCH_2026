import java.util.*;

class Candidate {
    int id;
    String name;
    int votes;

    Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }
}

class Voter {
    int id;
    String name;
    boolean hasVoted;

    Voter(int id, String name) {
        this.id = id;
        this.name = name;
        this.hasVoted = false;
    }
}

public class OnlineVotingSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Candidate> candidates = new HashMap<>();
    static Map<Integer, Voter> voters = new HashMap<>();

    static final String ADMIN_USER = "admin";
    static final String ADMIN_PASS = "1234";

    // ---------------- ADMIN ----------------
    static void adminPanel() {
        System.out.print("Enter admin username: ");
        String user = sc.nextLine();

        System.out.print("Enter admin password: ");
        String pass = sc.nextLine();

        if (!user.equals(ADMIN_USER) || !pass.equals(ADMIN_PASS)) {
            System.out.println("Invalid credentials!");
            return;
        }

        while (true) {
            System.out.println("\n--- Admin Panel ---");
            System.out.println("1. Add Candidate");
            System.out.println("2. View Candidates");
            System.out.println("3. View Results");
            System.out.println("4. Back");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addCandidate();
                case 2 -> viewCandidates();
                case 3 -> showResults();
                case 4 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addCandidate() {
        System.out.print("Enter Candidate ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        candidates.put(id, new Candidate(id, name));
        System.out.println("Candidate added!");
    }

    // ---------------- VOTER ----------------
    static void registerVoter() {
        System.out.print("Enter Voter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (voters.containsKey(id)) {
            System.out.println("Voter already registered!");
            return;
        }

        System.out.print("Enter Voter Name: ");
        String name = sc.nextLine();

        voters.put(id, new Voter(id, name));
        System.out.println("Voter registered!");
    }

    static void vote() {
        System.out.print("Enter Voter ID: ");
        int voterId = sc.nextInt();

        Voter voter = voters.get(voterId);

        if (voter == null) {
            System.out.println("Voter not registered!");
            return;
        }

        if (voter.hasVoted) {
            System.out.println("You have already voted!");
            return;
        }

        viewCandidates();

        System.out.print("Enter Candidate ID to vote: ");
        int candidateId = sc.nextInt();

        Candidate candidate = candidates.get(candidateId);

        if (candidate == null) {
            System.out.println("Invalid candidate!");
            return;
        }

        candidate.votes++;
        voter.hasVoted = true;

        System.out.println("Vote cast successfully!");
    }

    // ---------------- COMMON ----------------
    static void viewCandidates() {
        System.out.println("\n--- Candidates ---");
        for (Candidate c : candidates.values()) {
            System.out.println(c.id + " - " + c.name);
        }
    }

    static void showResults() {
        System.out.println("\n--- Results ---");

        Candidate winner = null;

        for (Candidate c : candidates.values()) {
            System.out.println(c.name + " : " + c.votes + " votes");

            if (winner == null || c.votes > winner.votes) {
                winner = c;
            }
        }

        if (winner != null)
            System.out.println("Winner: " + winner.name);
        else
            System.out.println("No votes yet.");
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Online Voting System ===");
            System.out.println("1. Admin Panel");
            System.out.println("2. Register Voter");
            System.out.println("3. Vote");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> adminPanel();
                case 2 -> registerVoter();
                case 3 -> vote();
                case 4 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}