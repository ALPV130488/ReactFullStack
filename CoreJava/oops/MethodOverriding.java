package oops;

class Parent8{
	
	public void display() {
		System.out.println("Iam from the parent class");
	}
	
	public void sum(int a , int b) {
		System.out.println("The sum is:-"+(a+b));
	}
}

public class MethodOverriding extends Parent8{
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
		
		obj.display();
		
		obj.sum(4, 5);
	}
	
	@Override
	public void display() {
		System.out.println("Iam from the Child class");
	}

}
