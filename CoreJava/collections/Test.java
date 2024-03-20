package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();
		
		
		Employee emp = new Employee("java", 100, 435634, "hyderabad");
				
				
		Employee emp1  = new Employee("html", 101, 3243, "India");
		
		
		hm.put(100, emp);
		
		hm.put(101, emp1);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your empId:-");
		
		int keys = scan.nextInt();
		
		System.out.println();
		
		System.out.println(hm.get(keys));
		
		
		
	}

}
