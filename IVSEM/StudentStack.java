import java.util.*;

class StudentStack {
    public static void main(String[] args) {

        Stack<String> actions = new Stack<>();

        // Add actions
        actions.push("Open Book");
        actions.push("Read Chapter 1");
        actions.push("Solve Problems");

        System.out.println("Actions: " + actions);

        // Undo last action
        System.out.println("Undo: " + actions.pop());

        System.out.println("After Undo: " + actions);

        // Check last action
        System.out.println("Top Action: " + actions.peek());
    }
}