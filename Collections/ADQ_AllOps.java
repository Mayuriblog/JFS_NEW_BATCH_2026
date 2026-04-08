import java.util.*;

public class ADQ_AllOps {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);

        System.out.println(dq.peek());

        dq.removeFirst();

        System.out.println(dq.contains(20));
        System.out.println(dq);
    }
}