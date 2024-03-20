package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(343, "apple");

		tm.put(234, "orange");

		tm.put(567, "guva");

		tm.put(324, "banana");

		tm.put(768, "mango");

		tm.put(743, "avacado");

		tm.put(987, "berry");

		System.out.println(tm);

		System.out.println(tm.get(768));
		
		Set<Integer> set = tm.keySet();
		
		System.out.println(set);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int key = (int) itr.next();
			
			System.out.println(key +"="+tm.get(key));
			
		}
		
	}
}
