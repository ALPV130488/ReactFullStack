package oops;

public class Child4 extends Parent6 {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		Child4 obj = new Child4();

		obj.dispaly();
		
		System.out.println(obj.add(2, 5));

	}

}
