/* Stack Operations */
import java.util.*;
class Stack_AllOps
{
	public static void main(String args[])
	{
		Stack<Integer> slist=new Stack<>();
		slist.push(4);
		slist.push(8);
		slist.push(12);
		slist.push(16);
		System.out.println(slist);
		System.out.println(slist.peek());
		slist.pop();
		System.out.println("After perform one pop operation");
		System.out.println(slist);
		System.out.println(slist.search(12));
		System.out.println(slist.size());
		System.out.println(slist.isEmpty());
		Iterator<Integer> it=slist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		slist.clear();
		
	}
}