package filehandling;

import java.io.FileWriter;
import java.io.IOException;

//it will not accept boolean dt

//it will not write integer values

//it will not have new line operation

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Rehman.txt");
	
		fw.write("good /n evening");
		
		fw.write(1234);
		
//		fw.write(true);
		
		char ch[] = {'a','b','g','d'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("Written into the file successfully");
	
	
	}
}
