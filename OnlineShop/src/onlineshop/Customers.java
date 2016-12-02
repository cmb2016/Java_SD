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
    private ArrayList<Stock> availableStock;
    private int numberOfPurchases;
    //private float priceOfBasket;
    private static double totalDownloaded;
    
    public Customers(String name,ArrayList<Stock> available, ArrayList<Stock> list) 
    {
        this.name = name;
        this.availableStock = available;
        this.purchaseHistory = list;
    }

    public void setName(String name) {
        this.name = name;
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
       
        if(st1.getQuantity() > 0)
        {
            purchaseHistory.add(st1);
            //numberOfPurchases++;
            stockBought(st1);
        }
        else
        {
            System.out.println("\nI'm Sorry but we are currently out of Stock for that item.\n");
        }
    }
    
    public void stockBought(Stock st1)
    {
        int quantity = 0;
        
        quantity = st1.getQuantity();
        
        st1.setQuantity(quantity - 1);
    }
    
    public void displayDetailsOfPurchases()
    {
        for(Stock st1: purchaseHistory)
        {
            System.out.println(st1); //   
            //Calls toString Method For each item of stock polymorfically at run time
        }
    }
    
    public void displayDownloadSize()
    {
        for(Stock st1: purchaseHistory)
        {   
            totalDownloaded = totalDownloaded + st1.calcDownloadSize();
            System.out.println("The Download size of " + st1.getName()
                    + " is: "+ st1.calcDownloadSize() +"GB"); //   
            //Calls toString Method For each item of stock polymorfically at run time
        }
        System.out.println("The Total Download Size is :" + totalDownloaded + "GBr");
    }
    
    public void sortByPrice()
    {
        Collections.sort(availableStock,new PriceComparator());
      
        Iterator itr = availableStock.iterator();
         
         while(itr.hasNext())
         {  
            Stock st1 =(Stock)itr.next();  
            System.out.println(st1.getPrice() + st1.getName());
         }  
    }
    
    public void sortByName()
    {
        Collections.sort(availableStock,new NameComparator());
      
        Iterator itr = availableStock.iterator();
         
         while(itr.hasNext())
         {  
            Stock st1 =(Stock)itr.next();  
            System.out.println(st1.getName());
         }  
        
    }
    
    public void sortAppsByReleaseDate()
    {
        Collections.sort(availableStock,new DateComparator());
      
        Iterator itr = availableStock.iterator();
         
         while(itr.hasNext())
         {  
            Stock st1 =(Stock)itr.next();
            System.out.println(st1.getReleaseDate());
         }  
    }
    
    public boolean searchForStock(Stock st1)
    {
       for (Stock stock: availableStock)
       {
           if(availableStock.contains(st1))
           {
               System.out.println("The stock called " +st1.getName()+ " was found");
               return true;
           }                 
        }
       System.out.println("No Item of Stock was found matching that name");       
       return false;
    }
}
