import java.util.*;

class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll(); // remove largest
            }
        }

        System.out.println("Kth Smallest: " + pq.peek());
    }
}