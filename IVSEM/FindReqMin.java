import java.util.*;
class FindReqMin
{
	public static void main(String args[])
	{
		int arr[]={29,11,17,8,25,16,3,9,20,30};
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			pq.offer(arr[i]);
		}
		//System.out.println(pq);
		pq.poll();
		System.out.println(" n-1 minimum : "+pq.poll());
		
		
	}
}