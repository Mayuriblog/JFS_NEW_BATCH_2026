import java.util.*;

public class LL_AllOps {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.addFirst(5);
        list.addLast(20);

        System.out.println(list.get(1));

        list.set(1, 15);

        list.removeFirst();

        System.out.println(list.contains(15));

        System.out.println("First: " + list.getFirst());
        System.out.println(list);
    }
}