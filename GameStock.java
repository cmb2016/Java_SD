/**
 * Created by CMB on 02/11/2016.
 */


public class GameStock extends Stock {
    private String genre;
    private String platform;
    private int ageRating;

    //User-defined constructor
    public GameStock(String name, String genre, String platform, int ageRating, double price, Date releaseDate, int quantity){
        super(name, price, releaseDate, quantity);
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
    }

    //Setters & Getters
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "GameStock{" +
                "genre='" + genre + '\'' +
                ", platform='" + platform + '\'' +
                ", ageRating=" + ageRating +
                '}';
    }
}
