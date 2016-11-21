/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

/**
 *
 * @author c07597614
 */
public class Songs {
    
    double duration;
    String title;
    String genre;
    String artist;
    int songSize = 128;
    
    public Songs(String title, double duration, String genre)
    {
        this.duration = duration;
        this.title = title;
        this.genre = genre;
    }
    
    public Songs()
    {
    
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSongSize() {
        return songSize;
    }

    @Override
    public String toString() {
        return "Songs{" + "title=" + title + ", duration=" + duration + ", genre=" + genre + '}';
    }
}
