package FilesIO;

import java.io.File;
import java.io.IOException;

public class _1FilesIO {

	public static void main(String[] args) throws IOException {
		
		
//		File file = new File("d://abc.txt"); 
//		try {
//			
//		boolean b = file.createNewFile();
//		
		
		File b = new File("D://One");
//		b.createNewFile();
		b.mkdir();
		
		System.out.println(b.exists());
//		if(b) {
//			System.out.println("File created");
//		}else {
//			System.out.println("File id already threre");
//		}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(file.exists());
		
		
//		create folder 
//		
//		File folder = new File("D:\\folderCreating\\folder\\one");
//		
//		folder.mkdir();
		
	}
}
