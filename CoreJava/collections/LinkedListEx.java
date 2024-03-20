package collections;

import java.util.LinkedList;

//collection:-
//(1)It will accept both homogenous and heterogeneous data.
//
//(2)There are lots of utility methods.
//
//(3)It's growable in nature.

//List:

//1.It's allowing duplicates
//2.It's Storing the insertion order

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(123);

		ll.add("apple");

		ll.add(true);

		ll.add('g');

		ll.add(123);

		ll.add("apple");

		ll.add(true);

		ll.add('g');

		System.out.println(ll);
		
		
	}

}
