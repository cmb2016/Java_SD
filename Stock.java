/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package onlineshop;

/**
 *
 * @author RoyTulie
 */
public class Stock 
{
    private String name;
    private double price;
    private Date releaseDate;
    private int quantity;

    public Stock() {
    }

    public Stock(String name, double price, Date releaseDate, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    
    
    
}
