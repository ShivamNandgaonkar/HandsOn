package collection;
import java.util.Vector;
public class Playlist 
{
	 private Vector<String> songs;

	    public Playlist() {
	        songs = new Vector<>();
	    }

	    public void addSong(String songName) {
	        songs.add(songName);
	    }

	    public void displayPlaylist() {
	        System.out.println("Current Playlist:");
	        for (String song : songs) {
	            System.out.println(song);
	        }
	    }

	    public void removeSong(String songName) {
	        songs.remove(songName);
	    }
	}

