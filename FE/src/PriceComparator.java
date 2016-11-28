/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
 */
import java.util.*;
/**
 *
 * @author c07597614
 */
public class PriceComparator implements Comparator<Stock> {
    @Override
    public int compare(Stock st1, Stock st2) 
    {
        return new Double(st1.getPrice()).compareTo(new Double(st2.getPrice()));
    }
}

