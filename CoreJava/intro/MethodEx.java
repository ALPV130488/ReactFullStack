package intro;

public class MethodEx {

	public void display() { 				// instance method-void
		System.out.println("hello Rehman!!!!");
		
		System.out.println(disMsg());

	}

	public static String disMsg() { // static method-String
		return "Good Evening!!!";

	}

	public int add(int a, int b) { // instance-int-params..

		return (a + b);

	}

	public static void main(String[] args) {

		MethodEx obj = new MethodEx();

		obj.display(); // method call

//		System.out.println(obj.add(2, 18));
		
		
		

	}
}
