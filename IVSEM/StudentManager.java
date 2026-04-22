import java.util.*;

class StudentManager {

    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();
        Stack<String> completed = new Stack<>();
        Vector<Integer> marks = new Vector<>();

        // Add tasks
        tasks.add("Study Java");
        tasks.add("Complete Assignment");
        tasks.add("Practice Coding");

        System.out.println("Tasks: " + tasks);

        // Add marks
        marks.add(85);
        marks.add(90);
        marks.add(78);
        System.out.println("Marks: " + marks);

        // Complete a task
        String done = tasks.removeFirst();
        completed.push(done);
        System.out.println("Completed: " + done);
        System.out.println("Remaining Tasks: " + tasks);

        // Undo last completed task
        if (!completed.isEmpty()) {
            String undoTask = completed.pop();
            tasks.addFirst(undoTask);
            System.out.println("Undo Task: " + undoTask);
        }

        System.out.println("Tasks after undo: " + tasks);

        // Add urgent task
        tasks.addFirst("Submit Project");
        System.out.println("After urgent task: " + tasks);

        // View first & last task
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());
    }
}