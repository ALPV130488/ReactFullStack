package collections;

import java.util.Comparator;
import java.util.TreeSet;
//collection:-
//(1)It will accept both homogenous and heterogeneous data.
//
//(2)There are lots of utility methods.
//
//(3)It's growable in nature.


//Set:

//1.It's not allowing duplicates
//2.It's  Storing the insertion order

//order:-alphabetical order/Ascending Order.
public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyOrder());
		
		ts.add("lion");
		
		ts.add("apple");		//98
		
		ts.add("orange");
		
		ts.add("berries");		//98-99=1
		
		ts.add("grapes");
		
		ts.add("guva");
		
//		ts.add(344);
//		
//		ts.add(676);
//		
//		ts.add(347);
//		
//		ts.add(88);
//		
//		ts.add(678);
//		
//		ts.add(455);
//		
//		ts.add(788);
		
		System.out.println(ts);
		
	}

}

class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
}
