/* PriorityQueue Operations */
import java.util.*;
class PQ_AllOps
{
	public static void main(String args[])
	{
		Queue<Integer> pq=new PriorityQueue<>(); //Collections.reverseOrder() 
		pq.add(41);
		pq.add(42);
		pq.add(43);
		System.out.println("After adding elements in PQ: "+pq);
		pq.offer(35);
		pq.offer(15);
		pq.offer(25);
		System.out.println("After adding elements using offer() in PQ: "+pq);
		System.out.println("PQ size: "+pq.size());
		System.out.println("contains(): "+pq.contains(25));
		System.out.println("remove(): "+pq.remove());
		System.out.println("remove(specific object) like 43: "+pq.remove(Integer.valueOf(43)));
		System.out.println("After removing elements in PQ: "+pq);
		System.out.println("Performing element() in PQ: "+pq.element());
		System.out.println("Performing peek() in PQ: "+pq.peek());
		//  Iterator (NOT sorted traversal)
        System.out.print("Iterator traversal: ");
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n ---***---\n"+((PriorityQueue<Integer>) pq).comparator());//null
       /* Comparator<? super Integer> comp = pq.comparator();

        System.out.println("\nComparator: " + comp);*/
		
		while(!pq.isEmpty()) 
		{
			System.out.print(pq.poll() + " ");
        }
		pq.clear();
		System.out.println("\nPQ clear: "+pq);
	}
}