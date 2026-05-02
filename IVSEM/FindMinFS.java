import java.util.*;
class FindMinFS
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(11);
		pq.offer(13);
		pq.offer(7);
		pq.offer(8);
		pq.offer(9);
		pq.offer(2);
		pq.offer(14);
		//System.out.println(pq);
		System.out.println("First min value: "+pq.poll());
		//System.out.println(pq);
		System.out.println("First min value: "+pq.poll());
	}
}