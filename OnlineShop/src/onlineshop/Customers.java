/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;
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
    
    public Customers(String name,ArrayList<Stock> list) 
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
            System.out.println(st1);    
            //Calls toString Method For each item of stock polymorfically at run time
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
    
    public boolean searchForStock(Stock st1)
    {
       for (Stock stock: purchaseHistory)
       {
           if(purchaseHistory.contains(st1))
           {
               System.out.println("The stock called " +st1.getName()+ " was found");
               return true;
           }                 
        }
       System.out.println("No Item of Stock was found matching that name");       
       return false;
    }
}
