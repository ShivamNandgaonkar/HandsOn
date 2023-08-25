package HandsOn;
/*
Create a program that represents a basic PlayList using a Vector to store song names. 
sImplement methods to:
a. Add songs to the PlayList.
b. Display the current PlayList.
c. Remove a song from the PlayList.
 */
import java.util.Vector;
public class Playlist
{
    private Vector<String> songs;
    public Playlist() 
    {
        songs = new Vector<>();
    }
    public void addSong(String song) 
    {
        songs.add(song);
    }
    public void displayPlaylist() 
    {
        for (String song : songs) 
        {
            System.out.println(song);
        }
    }
    public void removeSong(String song) 
    {
        songs.remove(song);
    }
    public static void main(String[] args)
    {
        Playlist playlist = new Playlist();
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Stairway to Heaven");
        playlist.addSong("Imagine");
        playlist.displayPlaylist();
        playlist.removeSong("Stairway to Heaven");
        playlist.displayPlaylist();
    }
}