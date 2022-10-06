package Question3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharCounter {
	
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
		System.out.println("Enter the file name");
		
		String name = sc.next();
		
		int index ;
		
		System.out.println(name.equals("Input.txt"));
		if(name.equals("Input.txt")) {
			
			index = fileReader.read();
			
		}else {
			
			index = fileReader1.read();
		}
		
		int count = 0;
		
		
		System.out.println("Enter the character to be counted");
		String str = sc.next();
		
		String one = str.toLowerCase();
		String two = str.toUpperCase();
		
		char char1 = one.charAt(0);
		char char2 = two.charAt(0);

	
		
		while(index !=-1) {
			
			if( (char) index  == char1 || (char) index == char2 ) {
				count++;
			}
			
			if(name.equals("Input.txt")) {
				
				index = fileReader.read();
				
			}else {
				
				index = fileReader1.read();
			}
			

		}
		System.out.println("File " + name + " has " + count + " instances of letter " + str );
		
		
		
	}

}
