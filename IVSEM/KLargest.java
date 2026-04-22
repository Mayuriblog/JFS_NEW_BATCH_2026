import java.util.*;

class KLargest {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }

        System.out.println("K Largest Elements: " + pq);
    }
}