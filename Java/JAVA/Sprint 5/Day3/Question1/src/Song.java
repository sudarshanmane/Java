import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class Song {
	

	private String movieName;
	private String songName;
	
	

	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public String getSongName() {
		return songName;
	}



	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}

	
	public Song(String songName,String movieName) {
		this.movieName = movieName;
		this.songName = songName;
	}

	
	void play(){
		
		System.out.println(songName+" of "+movieName+" is playing...!");	
		
	}

	

}
