/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package onlineshop;
import java.util.*;
/**
 *
 * @author RoyTulie
 */
public class Customers 
{
    private String name;
    private ArrayList<Stock> purchaseHistory;
    private int numberOfPurchases;
    private float priceOfBasket;
    
    public Customers(String name, ArrayList<Stock> list)
    {
        this.name = name;
        this.purchaseHistory = list;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList getPurchaseHistory()
    {
        return purchaseHistory;
    }
    
    public void addPurchase(Stock st1)
    {        
        purchaseHistory.add(st1);
        numberOfPurchases++;
    }
    
    public void displayAllDetails()
    {
        for(Stock st1: purchaseHistory)
        {
            System.out.println(st1);    //Calls toString Method For each item of stock polymorfically at run time
        }
    }
    
    public void sortStockByPrice()
    {
        Collections.sort(purchaseHistory,new PriceComparator());
      
        Iterator itr = purchaseHistory.iterator();
         
         while(itr.hasNext())
         {  
            Stock st1 =(Stock)itr.next();  
            System.out.println(st1.getPrice());
         }  
    }
    
    public void sortByName()
    {
        Collections.sort(purchaseHistory,new NameComparator());
      
        Iterator itr = purchaseHistory.iterator();
         
         while(itr.hasNext())
         {  
            Stock st1 =(Stock)itr.next();  
            System.out.println(st1.getName());
         }  
        
    }
}
