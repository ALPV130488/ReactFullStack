package collections;

import java.util.ArrayList;
//collection:-
//(1)It will accept both homogenous and heterogeneous data.
//
//(2)There are lots of utility methods.
//
//(3)It's growable in nature.


//List:

//1.It's allowing duplicates
//2.It's Storing the insertion order

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(123);

		al.add("string");

		al.add(true);

		al.add('c');

		al.add(123);

		al.add("string");

		al.add(true);

		al.add('c');
		
		al.remove(5);

		System.out.println(al);
		
		al.add(0);
		
		System.out.println(al);

	}

}
