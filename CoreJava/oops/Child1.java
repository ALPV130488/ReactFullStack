package oops;

class GrandParent {

	int apple = 34;

	public void display() {
		System.out.println("Iam from GrandParent class");
	}

}

class Parent1 extends GrandParent{

}

public class Child1 extends Parent1 {
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.display();
		
	}

}
