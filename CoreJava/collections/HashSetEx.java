package collections;

import java.util.HashSet;
//collection:-
//(1)It will accept both homogenous and heterogeneous data.
//
//(2)There are lots of utility methods.
//
//(3)It's growable in nature.


//Set:

//1.It's not allowing duplicates
//2.It's not Storing the insertion order

//it will it's own order to store the objects.


public class HashSetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(123);
		
		hs.add("true");
		
		hs.add(true);
		
		hs.add('c');
		
		hs.add(7.4f);
		

		hs.add(123);
		
		hs.add("true");
		
		hs.add(true);
		
		hs.add('c');
		
		hs.add(7.4f);
		
		System.out.println(hs);
		
		
	}
}
