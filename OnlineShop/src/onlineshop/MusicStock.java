package onlineshop;

import java.util.ArrayList;

/**
 * Created by CMB on 03/11/2016.
 */

public class MusicStock extends Stock{
  //  private double duration;
  //  private String artist;
     private ArrayList<Songs> songs;
     private static double songMemory = .256;
     private static double totalSongStorage;

     
    //User-defined constructor
    public MusicStock(String name, String artist, double duration, double price, int quantity, String genre, Date releaseDate){
        super(name, price, releaseDate, quantity, genre);
        //setArtist(artist);
        //setDuration(duration);
    }
    
    public MusicStock(String name, double price, Date releaseDate, int quantity, String genre, ArrayList<Songs> songs){
        super(name, price, releaseDate, quantity, genre);
        this.songs = songs;
        //setArtist(artist);
        //setDuration(duration);
    }
    
    public MusicStock(String name, double price, Date releaseDate, ArrayList<Songs> songs, int quantity){
        super(name, price, releaseDate, quantity);
        this.songs = songs;
        //setArtist(artist);
        //setDuration(duration);
    }
    
    public void addSong(Songs mySong)
    {
        songs.add(mySong);
        totalSongStorage = totalSongStorage + songMemory;
    }
    
     public void deleteSong(Songs mySong)
    {
        songs.remove(mySong);
        totalSongStorage = totalSongStorage - songMemory;
    }
    
    public void showAllMusic()
    {
        for (Songs song: songs) System.out.println(song);
    }
    @Override
    public double calcDownloadSize()
    {
        return totalSongStorage;
    }

    @Override
    public String toString() {
        return "\nMusicStock{" + super.getName() + " songs=" + songs + "}\n";
    }
    
    
}
