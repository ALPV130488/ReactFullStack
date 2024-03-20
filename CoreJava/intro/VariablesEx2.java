package intro;

public class VariablesEx2 {

	static int staticcounter;	//static global var

	int instancecounter;		//instance global var

	public void counter() {
		staticcounter++;

		instancecounter++;
	}

	public void display() {
		System.out.println("Static Counter:-" + staticcounter);
		System.out.println("Instance Counter:-" + instancecounter);
	}

	public static void main(String[] args) {

		VariablesEx2 obj1 = new VariablesEx2();

		VariablesEx2 obj2 = new VariablesEx2();
		
		VariablesEx2 obj3 = new VariablesEx2();
		
		obj1.counter();
		
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.counter();
		
		obj3.display();

	}

}
