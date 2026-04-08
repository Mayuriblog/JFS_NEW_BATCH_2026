import java.util.*;

public class TM_AllOps {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        map.remove(2);

        System.out.println(map);
    }
}