/* LinkedList Operations */
import java.util.*;
class LL_AllOps
{
	public static void main(String args[])
	{
		List<Integer> list=new LinkedList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.addFirst(1);
		list.addLast(13);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.remove(3));
		System.out.println(list.remove(Integer.valueOf(4)));
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list.size());
		System.out.println(list.contains(2));
		System.out.println(list.contains(1));
		list.clear();
		Deque<Integer> deqll=new LinkedList<>(list);
		deqll.offer(9);
		deqll.offer(10);
		deqll.offer(11);
		System.out.println(deqll.poll());
		System.out.println(deqll.peek());
		System.out.println(deqll);
		
		/*
		list.offer(11);
		list.offer(12);
		list.offer(13);
		System.out.println(list.poll());
		System.out.println(list.peek());
		System.out.println(list);*/
	}
}
