import java.util.*;

public class LHMOrder {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map); //  guaranteed order (based on insertion)
    }
}