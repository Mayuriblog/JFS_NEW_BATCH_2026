import java.util.*;

class RemoveDuplicatesLast {
    public static void main(String[] args) {

        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse from right to left
        for (int i = list.size() - 1; i >= 0; i--) {
            int val = list.get(i);

            if (!seen.contains(val)) {
                seen.add(val);
                result.add(val);  // keep last occurrence
            }
        }

        // Reverse to maintain order
        Collections.reverse(result);

        System.out.println("Original: " + list);
        System.out.println("Result (last occurrences): " + result);
    }
}