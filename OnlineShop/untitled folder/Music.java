/**
 * Created by CMB on 03/11/2016.
 */


public class Music extends Stock{
    private double duration;
    private String artist;

    //User-defined constructor
    public Music(String name, String artist, double duration, double price, Date releaseDate){
        super(name, price, releaseDate);
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
