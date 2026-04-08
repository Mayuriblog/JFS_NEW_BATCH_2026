import java.util.*;

public class AL_AllOps {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Access
        System.out.println(list.get(1));

        // Update
        list.set(1, 25);

        // Delete
        list.remove(0);

        // Search
        System.out.println(list.contains(25));

        // Special
        System.out.println("Size: " + list.size());
        System.out.println(list);
    }
}