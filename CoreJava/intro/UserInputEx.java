package intro;

import java.util.Scanner;

public class UserInputEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name:-");
		
		String name = scan.next();
		
		System.out.println();
		
		System.out.println("Your name is:-"+name);
		
		
		
	}

}
