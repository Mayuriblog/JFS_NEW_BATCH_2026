/*
import java.util.*;

class TMap_AllOps {
    public static void main(String[] args) {

        TreeMap<Integer, String> tmap =new TreeMap<>(Collections.reverseOrder());

        tmap.put(1, "A");
        tmap.put(3, "C");
        tmap.put(2, "B");

        System.out.println(tmap);
    }
}
*/
import java.util.*;
class MyComparator implements Comparator<Integer>
{
    public int compare(Integer a, Integer b) 
	{
        return b - a;  // descending
    }
}

class TMap_AllOps 
{
    public static void main(String[] args)
	{
		TreeMap<Integer, String> tmap =new TreeMap<>(new MyComparator());
        tmap.put(1, "A");
        tmap.put(3, "C");
        tmap.put(2, "B");
        System.out.println(tmap);
    }
}