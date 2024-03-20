package oops;

public class Company {

	public static void main(String[] args) {

		Employee emp = new Employee("Rehman",123,123445567,"India");
		
		System.out.println(emp);
		
		System.out.println("************");
		Employee emp1 = new Employee("sri",100,123445567,"India");
		
		System.out.println(emp1);
		
		System.out.println(emp1.toString());

	}

}
