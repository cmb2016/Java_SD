/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
 */
public interface IStock {

    double calcDownloadSize();

    String getGenre();

    String getName();

    double getPrice();

    int getQuantity();

    Date getReleaseDate();

    void setGenre(String genre);

    void setName(String name);

    void setPrice(double price);

    void setQuantity(int quantity);

    void setReleaseDate(Date releaseDate);
    
}
