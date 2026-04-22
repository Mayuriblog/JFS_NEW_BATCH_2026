/* ArrayDeque Operations */
import java.util.*;
class ADQ_AllOps
{
	public static void main(String args[])
	{
		Deque<Integer> adq=new ArrayDeque<>();
		/*adq.add(5);
		adq.add(10);
		adq.addFirst(2);
		adq.addLast(9);*/
		//safe method for insertion 
		adq.offer(5);
		adq.offer(3);
		adq.offer(10);
		adq.offerFirst(2);
		adq.offerLast(9);
		System.out.println("After inserting elements"+adq);
		/*adq.remove();
		System.out.println("after performing remove():"+adq);
		adq.removeFirst();
		System.out.println("after performing removeFirst():"+adq);
		adq.removeLast();
		System.out.println("after performing removeLast():"+adq);*/
		System.out.println(" performing poll():"+adq.poll());
		System.out.println(" performing pollFirst():"+adq.pollFirst());
		System.out.println(" performing pollLast():"+adq.pollLast());
		adq.offer(20);
		adq.offer(30);
		adq.offer(40);
		System.out.println(" Elements in ADQ: "+adq);
		System.out.println(" performing peek():"+adq.peek());
		System.out.println(" performing peekFirst():"+adq.peekFirst());
		System.out.println(" performing peekLast():"+adq.peekLast());
		System.out.println(" performing size():"+adq.size());
		System.out.println(" performing contains():"+adq.contains(30));
		
		/*-----------simple traversal--------
		for(int x:adq)
			System.out.println(x);
		-----------------------------------*/
		//Forward iterator
		Iterator<Integer> it=adq.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" --> ");
		}
		System.out.println("\n Backward iterator");
		//Backward iterator
		Iterator<Integer> dit=adq.descendingIterator();
		while(dit.hasNext())
		{
			System.out.print(dit.next()+" --> ");
		}
		System.out.println("\n");
		adq.clear();
		System.out.println(" performing clear():"+adq);
		
	}
}
