import java.util.*;

public class HM_AllOps {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map.get(1));

        map.put(1, "Z"); // update

        map.remove(2);

        System.out.println(map.containsKey(1));

        System.out.println(map);
    }
}