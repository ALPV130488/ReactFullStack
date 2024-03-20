package intro;

public class ConstructorEx {
	
	public ConstructorEx() {
		System.out.println("Iam from the default constr");
	}
	
	public ConstructorEx(int a,int b) {
		
		System.out.println("Iam from the parametrized constructor");
		
		System.out.println("The sum is:-"+(a+b));
		
	}
	
	public ConstructorEx(String name) {
		System.out.println("The name is:-"+name);
	}
	
	
	public String display() {
		return "hello";
	}

	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("apple");		//constr calling
		
		
		
	}
}
