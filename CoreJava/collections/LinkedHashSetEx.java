package collections;

import java.util.LinkedHashSet;
//collection:-
//(1)It will accept both homogenous and heterogeneous data.
//
//(2)There are lots of utility methods.
//
//(3)It's growable in nature.


//Set:

//1.It's not allowing duplicates
//2.It's  Storing the insertion order


public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(232);

		lhs.add(true);

		lhs.add(3874.34f);

		lhs.add("apple");

		lhs.add('c');

		lhs.add("mango");

		lhs.add(232);

		lhs.add(true);

		lhs.add(3874.34f);

		lhs.add("apple");

		lhs.add('c');

		lhs.add("mango");

		System.out.println(lhs);
		
		for(Object obj :lhs) {
			System.out.println(obj);
		}
		
	}

}
