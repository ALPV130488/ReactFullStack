package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//it will not accept boolean dt

//it will not write integer values

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Rehman.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("good /n morning");
		
		bw.newLine();

		bw.write(1234);
		
		bw.newLine();

//		bw.write(true);

		char ch[] = { 'a', 'b', 'g', 'd' };
		
		bw.newLine();

		bw.write(ch);

		bw.flush();

		bw.close();

		System.out.println("Written into the file successfully");

	}

}
