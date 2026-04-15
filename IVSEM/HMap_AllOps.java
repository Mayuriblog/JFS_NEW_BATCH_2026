import java.util.*;
class HMap_AllOps
{
	public static void main(String args[])
	{
		Map<Integer,String> hmap=new HashMap<>();
		Map<Integer,String> hmap2=new HashMap<>();
		hmap.put(1,"C");
		hmap.put(2,"C++");
		hmap.put(3,"Java");
		hmap.put(4,"DS");
		hmap.put(5,"HTML");
		System.out.println("First map details: "+hmap);
		hmap2.put(6,"CSS");
		hmap2.put(7,"JS");
		hmap2.put(8,"React JS");
		hmap2.put(1,"JFS");
		hmap2.put(2,"CP");
		System.out.println("Second Map Details: "+hmap2);
		hmap.putAll(hmap2);
		System.out.println("After Performing putAll() : "+hmap);
		System.out.println("After Performing get(1) : "+hmap.get(1));
		System.out.println("After Performing get(9) - key is not available : "+hmap.get(9));
		System.out.println("After Performing getOrDefault() : "+hmap.getOrDefault(9,"DBMS"));
		//hmap.remove(2,"C"); -- it is not matching so not removed
		hmap.remove(2);
		System.out.println("After removing key 2: "+hmap);
		System.out.println("Searching of key 2: "+hmap.containsKey(2));
		System.out.println("Searching of value JFS: "+hmap.containsValue("JFS"));
		System.out.println("size of  hmap: "+hmap.size());
		System.out.println("check the hmap is empty or not: "+hmap.isEmpty());
		hmap.replace(4,"DS","DBMS");
		System.out.println("After replacing value of key 4: "+hmap);
		System.out.println("Performing for each loop using values():");
		for(String v:hmap.values())
			System.out.print(v+" ");
		System.out.println("Performing for each loop using keySet():");
		for(Integer key : hmap.keySet()) 
			System.out.println(key + " -> " + hmap.get(key));
		hmap.putIfAbsent(2,"C++");
		System.out.println("Performing putIfAbsent() with the key 2:"+hmap);
		hmap.compute(1,(k,v)->v+" is a special subject");
		hmap.compute(10, (k, v) -> (v == null) ? "AWS" : v + "AWS");
		System.out.println("Performing compute() with the key 1 and 10:"+hmap);
		System.out.println("\nPerforming for each loop using lambda function:");
		hmap.forEach((k, v) -> System.out.println(k + " --> " + v));
		System.out.println("Performing for loop using entrySet():");
		for(Map.Entry<Integer, String> entry : hmap.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		hmap.clear();
		System.out.println("\nAfter performing clear operation: "+hmap);
		
		
	 
	}
}