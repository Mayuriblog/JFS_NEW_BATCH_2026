import java.util.*;
class GenerateUL
{
	static List<Integer> generate(List<Integer> alist)
	{
		List<Integer> blist=new ArrayList<>();
		for(int x:alist)
			if(!blist.contains(x))
				blist.add(x);
				
		return blist;
	}
	public static void main(String args[])
	{
		List<Integer> alist=new ArrayList<>(Arrays.asList(11,2,3,11,9,4,2,29));
		List<Integer> blist=generate(alist);
		System.out.println("Original list : "+alist);
		System.out.println("Unique list: "+blist);
	}

}