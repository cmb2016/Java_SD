/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

/**
 *
 * @author c07597614
 */
import java.util.*;
class NameComparator implements Comparator<Stock> 
{
    @Override
    public int compare(Stock st1, Stock st2) 
    {
        return st1.getName().compareTo(st2.getName());
    }
}

