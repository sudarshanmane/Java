import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList {
	
	public List<Song> songs = new ArrayList<>();
	
	HashSet<Song> hashSet = new HashSet<>();	
	
	
	
	public void addSong(Song song) {
		
		hashSet.add(song);
		
		if(hashSet.size()>songs.size()) {
			songs.add(song);
			System.out.println("Song added to the playlist successfully");
			song.play();
			
		}else {
			System.out.println("Song is already added in the playlist");

		}
		
	}


}
