package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Rehman.txt");
		
		pw.println("Good Morning");
		
		pw.println(1234);
		
		pw.println(true);
		
		pw.println('f');
		
		char ch[] = {'c','d','e'};
		
		pw.println(ch);
		
		
		
		
		
		System.out.println("Written into the file successfully");
		
		pw.flush();
		
		pw.close();
	}

}
