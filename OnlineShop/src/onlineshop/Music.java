package onlineshop;

import java.util.ArrayList;

/**
 * Created by CMB on 03/11/2016.
 */

public class Music extends Stock{
  //  private double duration;
  //  private String artist;
     private ArrayList<Songs> songs;
     private static double songMemory = .256;
     private static double totalSongStorage;

     
    //User-defined constructor
    public Music(String name, String artist, double duration, double price, Date releaseDate){
        super(name, price, releaseDate);
        //setArtist(artist);
        //setDuration(duration);
    }
    
    public Music(String name, double price, Date releaseDate, ArrayList<Songs> songs){
        super(name, price, releaseDate);
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
}
