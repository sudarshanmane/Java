package FileWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
	
	public static void main(String[] args) throws IOException {
		

		File file = new File("D://abc.txt");
		file.createNewFile();
		
		
		FileWriter fileWriter = new FileWriter("D://abc.txt");
		
		fileWriter.write("Focus on yourself /n not others");
		
		fileWriter.flush();
		fileWriter.close();
		
		FileReader fileReader= new FileReader("D://abc.txt");
		int index = fileReader.read();

		 while(index != -1) {
			System.out.println((char) index);
			index = fileReader.read();
			
		}
		

		
	}

}
