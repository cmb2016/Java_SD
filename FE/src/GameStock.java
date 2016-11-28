/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
 */
public class GameStock extends Stock {
    private String genre;
    private String platform;
    private int ageRating;
    private double gameSize;
    private double expansionSize;
    private int numExpansion = 0;

    //User-defined constructor
    public GameStock(String name, String genre, String platform, int ageRating, double price, Date releaseDate, int quantity, double gameSize, int numExpansion){
        super(name, price, releaseDate, quantity, genre);
        this.platform = platform;
        this.ageRating = ageRating;
        this.gameSize = gameSize;
        this.numExpansion = numExpansion;
    }

    //Setters & Getters
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    @Override
    public double calcDownloadSize()
    {
        double totalMemoryUsed;
        
        expansionSize = (gameSize / 2);
        
        totalMemoryUsed = gameSize + (expansionSize * numExpansion );
        
        return totalMemoryUsed;
    }

    @Override
    public String toString() {
        return "GameStock{" + super.getName() + "genre=" + genre + ", platform=" + platform + ", ageRating=" + ageRating + ", gameSize=" + gameSize + ", expansionSize=" + expansionSize + ", numExpansion=" + numExpansion + '}';
    }
    
    

}

