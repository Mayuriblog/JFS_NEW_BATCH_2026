import java.util.*;

public class LHM_AllOps {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "A");
        map.put(2, "B");

        map.get(1);

        map.remove(2);

        System.out.println(map);
    }
}