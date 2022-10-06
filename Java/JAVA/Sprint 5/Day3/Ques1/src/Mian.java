import java.util.ArrayList;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		
		ArrayList<Song> songs = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int a = 0;a<4;a++) {
			
			System.out.println("Enter song name");
			String sName = sc.nextLine();
			
			System.out.println("Enter movie name");
			String mName = sc.nextLine();
			
			Song s = new Song(sName,mName);
			songs.add(s);	
			
		}
		
		PlayList pl = new PlayList();
		for(Song song :songs) {
			
			
		    pl.addSong(song);
		    
		}
		
		System.out.println("-------paly of Song---------");
		
		for(Song play : pl.songs ) {
			Song song = play;
			song.play();
			
		}
		
		

	}

}
