import java.util.*;
class Hset_AllOps
{
	public static void main(String args[])
	{
		HashSet<Integer> hset=new HashSet<>();
		HashSet<Integer> hset2=new HashSet<>();
		hset.add(17);
		hset.add(27);
		hset.add(37);
		hset.add(27);
		hset.add(91);
		hset.add(35);
		System.out.println("First set: "+hset);
		hset2.add(57);
		hset2.add(47);
		hset2.add(49);
		hset2.add(17);
		hset2.add(27);
		System.out.println("Second set: "+hset2);
		//hset.addAll(hset2);
		//System.out.println("After combining of two sets using addAll: "+hset);
		//hset.removeAll(hset2);
		//System.out.println("After performing remove all operation using two sets :  "+hset);
		hset.retainAll(hset2);
		System.out.println("After performing retain all operation using two sets : "+hset);
		System.out.println("size of the hashhset: "+hset.size());		
		System.out.println("search for 11 element in the hset : "+hset.contains(11));
		System.out.println("using for loop");
		for(int x:hset)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n Removing 91 element using Iterator");
		Iterator<Integer> it = hset.iterator();
        while(it.hasNext())
        {
            int val = it.next();
            if(val == 91)
                it.remove();
        }
        System.out.println(hset);
		hset.clear();
		System.out.println("After performing clear operation: "+hset);
	}
}