package string;

public class StringEx {
	
	public static void main(String[] args) {
		
		String name = "apple";		//String Literal
		
		System.out.println(name.concat(" iphone"));
		
		name.concat(" iphone");
		
		System.out.println(name);
		
		System.out.println("************");
		
		StringBuffer name1 = new StringBuffer("apple");
		
		name1.append(" iphone");
		
		System.out.println(name1);
		
		
		
	}

}
