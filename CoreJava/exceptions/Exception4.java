package exceptions;

class Exception4 {
	public static void main(String args[]) {
		try {

			int c = 12 / 0;
			
			try {
				System.out.println("line 9---Division--1st child try ");
				int b = 30 / 1;
			} catch (ArithmeticException e) {
				System.out.println("line 12---1st child catch" + e);
			}
			try {
				int a[] = new int[3];
				a[2] = 4; 
				System.out.println("line 17---2nd child try block");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("line 19---array index problem--2nd child catch");
			} finally {
				System.out.println("line 21---always will execute finally block -- finally	");
			}
			System.out.println("line 23---remaing try  statements--main try");
		} catch (Exception e) {
			System.out.println("line 25--not handeled --main catch  " + e);
		}
		System.out.println("line 27---normal execution..");
	}
}