/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

/**
 *
 * @author RoyTulie
 */
public interface IStock {

    //Setters & Getters
    String getName();

    double getPrice();

    int getQuantity();

    Date getReleaseDate();

    void setName(String name);

    void setPrice(int price);

    void setQuantity(int quantity);

    void setReleaseDate(Date releaseDate);

    String toString();
    
}
