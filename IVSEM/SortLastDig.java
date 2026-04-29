import java.util.*;

public class SortLastDig {
    public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>((a, b) -> (a % 10) - (b % 10));
		ts.add(14);
		ts.add(21);
		ts.add(33);
		ts.add(42);
		ts.add(15);
		ts.add(15);
		ts.add(25);

		System.out.println(ts);
	}
}