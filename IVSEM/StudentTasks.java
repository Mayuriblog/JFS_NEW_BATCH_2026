import java.util.*;

class StudentTasks {

    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add tasks
        tasks.add("Complete Assignment");
        tasks.add("Study Java");
        tasks.add("Practice Coding");

        System.out.println("Tasks: " + tasks);

        // Add at beginning (urgent task)
        tasks.addFirst("Submit Project");
        System.out.println("After adding urgent task: " + tasks);

        // Remove completed task
        tasks.remove("Study Java");
        System.out.println("After removing completed task: " + tasks);

        // View first and last task
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());

        // Remove first task (done)
        tasks.removeFirst();
        System.out.println("After completing first task: " + tasks);
    }
}