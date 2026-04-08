import java.util.*;

public class LHS_AllOps {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set.contains(2));

        set.remove(1);

        System.out.println(set);
    }
}