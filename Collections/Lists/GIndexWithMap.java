import java.util.*;

public class GIndexWithMap {

    public static int computeGIndex(HashMap<Integer, Integer> map) {

        // Step 1: Get citation values
        List<Integer> citations = new ArrayList<>(map.values());

        // Step 2: Sort in descending order
        Collections.sort(citations, Collections.reverseOrder());
		System.out.println(citations);

        // Step 3: Calculate g-index
        int sum = 0;
        int g = 0;

        for (int i = 0; i < citations.size(); i++) {
            sum += citations.get(i);

            int currentG = i + 1;

            if (sum >= currentG * currentG) {
                g = currentG;
            }
        }

        return g;
    }

    public static void main(String[] args) {

        // Paper No -> Citation Count
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 3);
        map.put(4, 6);
        map.put(5, 0);

        // Print map
        map.forEach((k, v) -> System.out.println("Paper " + k + " ---> " + v));

        int gIndex = computeGIndex(map);

        System.out.println("G-Index: " + gIndex);
    }
}