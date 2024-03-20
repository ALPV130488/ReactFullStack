package collections;

import java.util.Vector;

//collection:-
//(1)It will accept both homogenous and heterogeneous data.
//
//(2)There are lots of utility methods.
//
//(3)It's growable in nature.

//List:

//1.It's allowing duplicates
//2.It's Storing the insertion order

public class VectorEx {
	
	public static void main(String[] args) {
		Vector vec =new Vector();	

		vec.add(123);

		vec.add("apple");

		vec.add(true);

		vec.add('g');

		vec.add(123);

		vec.add("apple");

		vec.add(true);

		vec.add('g');
		
		System.out.println(vec);
	}

}
