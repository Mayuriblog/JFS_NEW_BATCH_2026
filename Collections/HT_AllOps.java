import java.util.*;

public class HT_AllOps {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");

        System.out.println(ht.get(1));

        ht.remove(2);

        System.out.println(ht.containsKey(1));

        System.out.println(ht);
    }
}