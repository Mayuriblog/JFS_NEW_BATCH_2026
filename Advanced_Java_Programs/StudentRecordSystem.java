import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    char getGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 50) return 'D';
        else return 'F';
    }
}

public class StudentRecordSystem {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Student> students = new HashMap<>();

    // -------- ADD --------
    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(id)) {
            System.out.println("Student already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.put(id, new Student(id, name, marks));
        System.out.println("Student added!");
    }

    // -------- VIEW --------
    static void viewStudents() {
        System.out.println("\n--- Student Records ---");
        for (Student s : students.values()) {
            System.out.println(s.id + " | " + s.name +
                    " | Marks: " + s.marks +
                    " | Grade: " + s.getGrade());
        }
    }

    // -------- SEARCH --------
    static void searchStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Student s = students.get(id);

        if (s != null) {
            System.out.println(s.id + " | " + s.name +
                    " | Marks: " + s.marks +
                    " | Grade: " + s.getGrade());
        } else {
            System.out.println("Student not found!");
        }
    }

    // -------- UPDATE --------
    static void updateStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student s = students.get(id);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter New Marks: ");
        s.marks = sc.nextDouble();

        System.out.println("Student updated!");
    }

    // -------- DELETE --------
    static void deleteStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (students.remove(id) != null) {
            System.out.println("Student deleted!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // -------- AVERAGE --------
    static void calculateAverage() {
        if (students.isEmpty()) {
            System.out.println("No records!");
            return;
        }

        double sum = 0;
        for (Student s : students.values()) {
            sum += s.marks;
        }

        double avg = sum / students.size();
        System.out.println("Average Marks: " + avg);
    }

    // -------- SORT --------
    static void sortByMarks() {
        List<Student> list = new ArrayList<>(students.values());

        list.sort((a, b) -> Double.compare(b.marks, a.marks));

        System.out.println("\n--- Sorted by Marks (High to Low) ---");
        for (Student s : list) {
            System.out.println(s.id + " | " + s.name +
                    " | " + s.marks);
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Student Record System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Calculate Average");
            System.out.println("7. Sort by Marks");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> calculateAverage();
                case 7 -> sortByMarks();
                case 8 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}