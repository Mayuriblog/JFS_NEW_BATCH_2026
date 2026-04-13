import java.util.*;
class AvgMarks
{
	public static void main(String args[])
	{
		//List<Integer> list=new ArrayList<Integer>(); -- old style java6/7
		//ArrayList<Integer> list=new ArrayList<>();  
		List<Integer> list=new ArrayList<>(); // java 7+
		System.out.println("Default list: "+list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(50);
		//list.add(10.98);
		//list.add("A");
		//list.add('A');
		System.out.println("After adding elements in a list: "+list);
		// 1. Adding Elements at the specific index
		list.add(3,40);
		System.out.println("After Adding element at index 3 : "+list);
		// 2. Removing Element using index
		//remove(int index)  remove(Object o)
		//list.remove(10);
		list.remove(Integer.valueOf(10));
		//Integer.valueOf() is a method of the wrapper class Integer 
		//that converts a value into an Integer object.
		System.out.println("After removing element 10 : "+list);
		// 3. Updating value at index 0
      	list.set(0, 99);
        System.out.println("List after updation of value at 0 index : "+list);
		// 4. size of a list
		System.out.println("Size of a list : "+list.size());
		// 5. Searching of an element
		System.out.println("Search for value 10 in the list : "+list.contains(Integer.valueOf(10)));
		// 6. foreach loop using get()
		int i = 0;
		for (int val : list) 
		{
			System.out.println("Index: " + i + " Value: " + list.get(i));
			i++;
        }
		// 7. indexOf() is used to find the position (index) of an element in a List.
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(20));
		System.out.println(list.isEmpty());
		
	}
} 