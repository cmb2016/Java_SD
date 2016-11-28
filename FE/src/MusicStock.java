
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
 */
public class MusicStock extends Stock{
    private double duration;
    private String artist;
    private ArrayList<Songs> songs;
    private static double songMemory = .256;
    private static double totalSongStorage;

    //User-defined constructor
    public MusicStock(String name, String artist, double duration, double price, Date releaseDate, int quantity, String genre){
        super(name, price, releaseDate, quantity, genre);
        setArtist(artist);
        setDuration(duration);
    }
    
    public MusicStock(String name, double price, Date releaseDate, ArrayList<Songs> songs, int quantity){
        super(name, price, releaseDate, quantity);
        this.songs = songs;
        //setArtist(artist);
        //setDuration(duration);
    }
    
    //Setters & Getters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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
        return "Music{" + super.getName() +
                "duration=" + duration +
                ", artist='" + artist + '\'' +
                '}';
    }
}

