package exceptions;

import java.util.Scanner;

public class Exception1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numerator:-");
		
		int num = scan.nextInt();
		
		System.out.println("Enter the denominator:-");
		
		int den= scan.nextInt();
		
		try {
		
		int result  = num/den;
		
		System.out.println("The result is:-"+result);}
		
		catch(Exception ae) {
			
			System.out.println("don't enter zero as denominator");
			
		}
		
		
		
		
		
	}

}
