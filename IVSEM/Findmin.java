import java.util.*;
class Findmin
{
	public static void main(String[] args)
	{
		// 7,78,61,10,25
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(7);
		pq.offer(78);
		pq.offer(61);
		pq.offer(10);
		pq.offer(25);
		System.out.println(pq);
		// First Minimum
		System.out.println("The First Minimum Value : " + pq.poll());
		System.out.println(pq);
		// Second Minimum
		System.out.println("The Second Minimum Value : " + pq.poll());
		
	}
}