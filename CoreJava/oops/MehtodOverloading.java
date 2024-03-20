package oops;

public class MehtodOverloading {

	public void add(int a, int b) {
		System.out.println("6.The sum of 2 integers is:-" + (a + b));
	}

	public void add(int a, int b, int c) { // No:of params are diff
		System.out.println("10.The sum of 3 integers is:-" + (a + b + c));
	}

	public void add(float a, int b) {
		System.out.println("14.The sum of float and int is:-" + (a + b));
	}

	public void add(int a, float b) { // Order is diff
		System.out.println("18.The sum of int and float is:-" + (a + b));
	}

	public void add(float a, float b) { // type is diff

		System.out.println("23.The sum of two floats are :-" + (a + b));
	}

	public static void main(String[] args) {
		MehtodOverloading obj = new MehtodOverloading();

		obj.add('b', 'a' );
		
		
	}
}
