package controlstatements;

public class ForEx {
	
	public static void main(String[] args) {
		
//		for(int i =0 ;i<=100;i+=2) {
//		
//			System.out.println(i);
//		}
		
		
		
		String[] apple = {"apple","bat","cat","rat","fat"};
		
		
		for(int i = 0 ;i<apple.length;i++) {
			System.out.println(apple[i]);
		}
		
		
		
		System.out.println("*********");
		
		for(String var :apple) {		//enhanced for loop
			System.out.println(var);
		}
		
		
		
		
	}

}
