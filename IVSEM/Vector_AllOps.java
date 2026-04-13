/* Vector Operations */
import java.util.*;
class Vector_AllOps
{
	public static void main(String args[])
	{
		List<Integer> vlist=new Vector<>();
		vlist.add(3);
		vlist.add(6);
		vlist.add(9);
		vlist.add(2,5);
		vlist.add(4,10);
		System.out.println(vlist);
		System.out.println(vlist.get(3));
		vlist.set(2,9);
		vlist.set(3,12);
		System.out.println(vlist);
		vlist.remove(Integer.valueOf(10));
		vlist.remove(3);
		System.out.println(vlist);
		System.out.println(vlist.size());
		System.out.println(vlist.contains(9));
		//this is only for legacy classes (vector,hash table)
		//not for list obj
		/*Enumeration<Integer> e = vlist.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }*/
		
        Iterator<Integer> it = vlist.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
		vlist.clear();
		System.out.println(vlist);
	}
}