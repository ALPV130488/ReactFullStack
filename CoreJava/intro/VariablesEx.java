package intro;

public class VariablesEx {
	
	static int value = 34;		//global static variable
	
	int value1 = 23;			//global instance variable
	
	
	
	public static void main(String[] args) {

		System.out.println("This is an Example for variables");
		
		int value = 45;
		
		System.out.println("local variable:-" + value);   	//local variables

		System.out.println("static global var:-"+VariablesEx.value);
		
		VariablesEx obj = new VariablesEx();		//OBJECT CREATION
		
		System.out.println("global instance var:-" + obj.value1);
	
	}

}
