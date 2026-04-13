//SB1 BATCH
import java.util.*;
class AL_AllOps
{
	public static void main(String args[])
	{
		List<Integer>  list=new  ArrayList<>();
		System.out.println("Empty List:"+list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		System.out.println("After adding elements in the List:"+list);
		list.add(3,49);
		System.out.println("After adding elements at the 3rd index in the List:"+list);
		//size of a list
		System.out.println("Size of an array list: "+list.size());
		System.out.println("Searching of 49 element in the list: "+list.contains(49));
		list.set(5,60);
		System.out.println("After updating 5th index element: "+list);
		
		System.out.println(" index of 10 : "+list.indexOf(10));
		System.out.println(" Last index of 10 : "+list.lastIndexOf(10));
		list.remove(4);
		list.remove(Integer.valueOf(49));
		System.out.println("After removing 49 element in the list: "+list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Element at "+i+" index: "+list.get(i));
		}
		list.clear();
		if(list.isEmpty())
		{
			System.out.println("List is empty....");
		}
		else
		{
			System.out.println("List is N O T ..empty....");
		}
		
		

		List<Integer> alist = new ArrayList<>(Arrays.asList(15, 6, 17));
		alist.sort(null);
		
		System.out.println("sorted AList : ");
		
		for(Integer x : alist)
			System.out.println(x);

		List<Integer> blist = new ArrayList<>(Arrays.asList(6,7,8,9));
		
		Integer arr[] = alist.toArray( new Integer[0]);
		
		System.out.println("AList.toArray : ");
		
		for(Integer x : arr)
			System.out.println(x);
		
		//alist.addAll(blist);
		//System.out.println("AList : "+alist);
		//System.out.println("BList : "+blist);
		
		//alist.removeAll(blist);
		//System.out.println("AList : "+alist); // A-B
		
		//alist.retainAll(blist);
		//System.out.println("AList : "+alist); // A  intersection B
		
		System.out.println("Iterator : ");
		Iterator itr=alist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}