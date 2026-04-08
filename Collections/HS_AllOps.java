import java.util.*;

public class HS_AllOps {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set.contains(20));

        set.remove(10);

        System.out.println("Size: " + set.size());
        System.out.println(set);
    }
}