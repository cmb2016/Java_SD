/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
 */
public abstract class Stock implements IStock{
    private String name;
    private double price;
    private Date releaseDate;
    private int quantity;
    private String genre;

    public Stock() {
    }

    public Stock(String name, double price, Date releaseDate, int quantity, String genre) {
        this.price = price;
        this.name = name;
        this.releaseDate = releaseDate;
        this.quantity = quantity;
        this.genre = genre;
    }
    
    public Stock(String name, double price, Date releaseDate, int quantity){
        setName(name);
        setPrice(price);
        setReleaseDate(releaseDate);
        setQuantity(quantity);
    }
    
    public Stock(int quantity){
        setQuantity(quantity);
    }

    public Stock(String name){
        this.name = name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}

