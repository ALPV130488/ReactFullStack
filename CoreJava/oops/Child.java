package oops;

class Parent {

	int apple = 34;

	public void display() {
		System.out.println("Iam from parent class");
	}

}

public class Child extends Parent {

	public static void main(String[] args) {

		Child obj = new Child();

		System.out.println(obj.apple);

		obj.display();

	}

}
