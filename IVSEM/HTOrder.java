import java.util.*;

public class HTOrder {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(null, "A");
        System.out.println(ht); //  NullPointerException
    }
}