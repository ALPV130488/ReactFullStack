package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	public void division(int a, int b) throws ArithmeticException,FileNotFoundException {
//		int result = a / b;

		FileReader obj = new FileReader("hello.txt");

	}

	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {

		Throws obj = new Throws();// obj creation

		obj.division(4, 0);
	}

}
