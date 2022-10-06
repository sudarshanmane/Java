import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Song> list =new  ArrayList<>();
		list.add(new Song("One", "Two"));
		list.add(new Song("One", "Two"));

		list.add(new Song("Three", "Four"));
		list.add(new Song("Six", "Five"));
		
		PlayList list2 = new PlayList();
		
		for(Song name : list) {
			
			list2.addSong(name);
		}


		
	}

}
