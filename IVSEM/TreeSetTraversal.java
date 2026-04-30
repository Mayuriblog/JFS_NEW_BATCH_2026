import java.util.*;
class TreeSetTraversal
{
	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(15,10,7,8,6,20,18,30,4));
		//HashSet<Integer> hs=new HashSet<>(Arrays.asList(15,10,7,8,6,20,18,30,4));
		//LinkedHashSet<Integer> lhs=new LinkedHashSet<>(Arrays.asList(15,10,7,8,6,20,18,30,4));
		System.out.println("TreeSet order: "+ts);
		//System.out.println("HashSet order: "+hs);
		//System.out.println("LinkedHashSet order: "+lhs);
		              
		// forward traversal
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() +" ");
		}
		System.out.println();
		// reverse traversal
		Iterator<Integer> itd = ts.descendingIterator();
		while(itd.hasNext())
		{
			System.out.print(itd.next() +" ");
		}
			
		
	}
}
