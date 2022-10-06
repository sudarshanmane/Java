package Question4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFiles {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D://Input.text");
		file.createNewFile();
	
		FileWriter fileWriter = new FileWriter(file);
		
		fileWriter.write("Developers use Java to construct applications in laptops, "
				+ "data centres, game consoles, scientific supercomputers, cell "
				+ "phones, and other devices. Java is the world's third most popular "
				+ "programming language, after Python and C – according to the TIOBE "
				+ "index, which evaluates programming language popularity.");
		
		fileWriter.flush();
		fileWriter.close();
		FileReader  fileReader = new FileReader(file);
		
		File file1 = new File("D://abc.text");
		file1.createNewFile();
		
		FileWriter fileWriter1 = new FileWriter(file1);

		
		fileWriter1.write("What is a Thread in Java? A thread in Java is the "
				+ "direction or path that is taken while a program is being "
				+ "executed. Generally, all the programs have at least one "
				+ "thread, known as the main thread, that is provided by the "
				+ "JVM or Java Virtual Machine at the starting of "
				+ "the program's execution.");
		
		fileWriter1.flush();
		fileWriter1.close();
		
		FileReader  fileReader1 = new FileReader(file1);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input file name");
		
		String input = sc.next();
		
		int index ;
		if(input.equals("Input.txt")) {

			index = fileReader.read();
			
		}else {
			index = fileReader1.read();
		}
		
		System.out.println("Enter the output file name");
		String out = sc.next();
		
		File file2 = new File("D://"+out);
		file2.createNewFile();
		
		FileWriter fileWriter2 = new FileWriter(file2);
		
		

		
		while(index !=-1) {
			
			if(input.equals("Input.txt")) {
				fileWriter2.append((char) index);
				index = fileReader.read();
								
			}else {
				fileWriter2.append((char) index);
				index = fileReader1.read();
			}
			

		}
		
		fileWriter2.flush();
		fileWriter2.close();
		
		FileReader fileReader2 = new FileReader(file2);
		
		int index1 = fileReader2.read();
		while(index1 != -1) {
			System.out.println((char) index1);
			index1 = fileReader2.read();
		}
		
		
		
	}
}
