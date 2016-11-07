/**
 * Created by CMB on 03/11/2016.
 */


public class MusicStock extends Stock{
    private double duration;
    private String artist;

    //User-defined constructor
    public MusicStock(String name, String artist, double duration, double price, Date releaseDate, int quantity){
        super(name, price, releaseDate, quantity);
        setArtist(artist);
        setDuration(duration);
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

    @Override
    public String toString() {
        return "Music{" +
                "duration=" + duration +
                ", artist='" + artist + '\'' +
                '}';
    }
}
