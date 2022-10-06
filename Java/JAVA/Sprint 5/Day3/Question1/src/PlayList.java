import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PlayList {
	
	
		
		public List<Song> songs = new ArrayList<>();

		
		LinkedHashSet<Song> s = new LinkedHashSet<>();
		LinkedHashSet<Song> s1 = new LinkedHashSet<>();
		
	 public void addSong(Song song) {
		
		 
		if(s.size() == 0 && s1.size()==0) {
			songs.add(song);
			s.add(song);
			s1.add(song);
			
			 System.out.println("Song added to the playlist successfully.");

		}else {
			s.add(song);
			if(s.size()>s1.size()) {
				songs.add(song);
				 s1.add(song);
	
				 System.out.println("Song added to the playlist successfully.");
			}
			else {
				System.out.println("Song is already added in the playlist");
			}
			
		}
		
		 }
	 
	 
	 

	
	
		 
	

}
