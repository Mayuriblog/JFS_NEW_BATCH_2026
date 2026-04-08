import java.util.*;

public class TS_AllOps {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set.first());
        System.out.println(set.last());

        set.remove(20);

        System.out.println(set.contains(10));
        System.out.println(set);
    }
}