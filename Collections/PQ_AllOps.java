import java.util.*;

public class PQ_AllOps {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.peek());

        pq.poll();

        System.out.println(pq.contains(20));
        System.out.println(pq);
    }
}