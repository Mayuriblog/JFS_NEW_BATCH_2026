import java.util.*;
class LHset_AllOps
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> lhset=new LinkedHashSet<>();
		LinkedHashSet<Integer> lhset2=new LinkedHashSet<>();
		lhset.add(17);
		lhset.add(27);
		lhset.add(37);
		lhset.add(27);
		lhset.add(91);
		lhset.add(35);
		System.out.println("First set: "+lhset);
		lhset2.add(57);
		lhset2.add(47);
		lhset2.add(49);
		lhset2.add(17);
		lhset2.add(27);
		System.out.println("Second set: "+lhset2);
		lhset.addAll(lhset2);
		System.out.println("After combining of two sets using addAll: "+lhset);
		//lhset.removeAll(lhset2);
		//System.out.println("After performing remove all operation using two sets :  "+lhset);
		//lhset.retainAll(lhset2);
		//System.out.println("After performing retain all operation using two sets : "+lhset);
		System.out.println("size of the linkedhashset: "+lhset.size());		
		System.out.println("search for 11 element in the lhset : "+lhset.contains(11));
		System.out.println("using for loop");
		for(int x:lhset)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n Removing 91 element using Iterator");
		Iterator<Integer> it = lhset.iterator();
        while(it.hasNext())
        {
            int val = it.next();
            if(val == 91)
                it.remove();
        }
        System.out.println(lhset);
		lhset.clear();
		System.out.println("After performing clear operation: "+lhset);
	}
}