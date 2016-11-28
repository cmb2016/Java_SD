/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

import java.util.Comparator;

public class DateComparator implements Comparator<Stock> {
    @Override
    public int compare(Stock st1, Stock st2) 
    {
        
        return st1.getReleaseDate().compareTo(st2.getReleaseDate());
    }
}