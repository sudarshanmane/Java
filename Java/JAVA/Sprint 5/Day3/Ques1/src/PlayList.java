import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList {
	
	public List<Song> songs = new ArrayList<>();
	
	
	HashSet<Song> s1 = new HashSet<>();
	HashSet<Song> s2 = new HashSet<>();
	
	public void addSong(Book song){
		s1.add(song);
		
		if(s1.size()>s2.size()) {
			s2.add(song);
			songs.add(song);
		    System.out.println("Song added to the playlist successfully.");
		}else {
			System.out.println("Song is already added in the playlist");
		}
		
		
		
	}




}
