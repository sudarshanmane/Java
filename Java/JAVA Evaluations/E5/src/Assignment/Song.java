package Assignment;

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
	
	
	
	public Song(String movieName, String songName) {
		this.movieName = movieName;
		this.songName = songName;
	}
	
	
	
}
