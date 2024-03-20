package oops;

interface Parent2{
	
	public int add(int a,int b); 
}


interface Parent3{
	
	public int add(int a,int b); 
}



public class Child2 implements Parent2,Parent3{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	
	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		System.out.println(obj.add(2, 3));
		
		
	}
	
	
}
