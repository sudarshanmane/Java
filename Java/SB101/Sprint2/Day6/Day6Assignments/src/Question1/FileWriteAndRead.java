package Question1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Write a program to read the content of the file abc.txt using FileReader.

public class FileWriteAndRead {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D://abc.txt");
		file.createNewFile();
		
		FileWriter fileWriter = new FileWriter("D://abc.txt");
		
		fileWriter.write("Think about yorself \n not about others");
		fileWriter.write("\n Keep Trying");
		
		fileWriter.flush();
		fileWriter.close();
		
		FileReader reader = new FileReader("D://abc.txt");
		
		int index = reader.read();
		
		while(index != -1) {
			
			System.out.println((char) index);
			index = reader.read();
		}
		
		
		
	}

}
