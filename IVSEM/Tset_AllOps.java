import java.util.*;
class Tset_AllOps
{
	public static void main(String args[])
	{
		TreeSet<Integer> tset=new TreeSet<>();
		tset.add(11);
		tset.add(22);
		tset.add(33);
		tset.add(12);
		tset.add(13);
		tset.add(14);
		System.out.println(tset);
		System.out.println("size of the treeset: "+tset.size());		
		System.out.println("search for 11 element in the set : "+tset.contains(11));
		System.out.println("first element in the set : "+tset.first());
		System.out.println("last element in the set : "+tset.last());
		System.out.println("Next greatest element of 22 in the set : "+tset.higher(22));
		System.out.println("Next Smallest element of 22 in the set : "+tset.lower(22));
		System.out.println(">= to the 14 element in the set : "+tset.ceiling(15));
		System.out.println("<= to the 14 element in the set : "+tset.floor(15));
		System.out.println("using for loop");
		for(int x:tset)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n Removing 13 element using Iterator");
		Iterator<Integer> it = tset.iterator();
        while(it.hasNext())
        {
            int val = it.next();
            if(val == 13)
                it.remove();
        }
        System.out.println(tset);
		System.out.println("using descendingIterator");
		Iterator<Integer> dit=tset.descendingIterator();
		while(dit.hasNext())
		{
			System.out.print(dit.next()+" ");
		}
		tset.clear();
		System.out.println("\nAfter performing clear operation: "+tset);
	}
}