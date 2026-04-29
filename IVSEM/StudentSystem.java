import java.util.*;

public class StudentSystem {
    public static void main(String[] args) {

        LinkedHashSet<String> registration = new LinkedHashSet<>();
        TreeSet<String> sorted = new TreeSet<>();

        // Add students
        String[] students = {"Ravi", "Anu", "Kiran", "Ravi"};

        for(String s : students) {
            registration.add(s);
            sorted.add(s);
        }

        System.out.println("Registration Order:");
        System.out.println(registration);

        System.out.println("Sorted List:");
        System.out.println(sorted);
    }
}