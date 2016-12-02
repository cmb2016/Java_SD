package onlineshop;



/**
 * Created by CMB on 02/11/2016.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Tester {

public static void main(String[] args){
        
        //creating objects of type Date
        Date d1 = new Date(31, 12, 2016); 
        Date d2 = new Date(31, 12, 2017);
        //d1.compareTo(d2);
           
        //creating objects of type Actor 
        Actor a1 = new Actor("Emma", "Watson");
        Actor a2 = new Actor("Robert", "Downey Jr");
        Actor a3 = new Actor("Jude", "Law");
        
        //forming a hash set using Actor objects created above
        HashSet<Actor> actorList = new HashSet<>();
        
        //creating objects of type Songs
        Songs song1 = new Songs("Torn",3.14,"Rock");
        Songs song2 = new Songs("Umbop",2.98,"Pop");
        Songs song3 = new Songs("Stan",3.33,"Rap");
        
        //forming an ArrayList of type Songs
        ArrayList<Songs> list3 = new ArrayList<Songs>();
        
        //creating a MusicStock object called playlist
        MusicStock playlist = new MusicStock("90's Playlist ", 4, d1, list3, 20);
        
        //Adding songs created above into playlist
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        
        //creating MovieStock objects 
        MovieStock m1 = new MovieStock("Iron Man", 120, "SciFi", actorList, 3.50, d1, 10, "hd");
        MovieStock m2 = new MovieStock("The Holiday", 130, "Romance", actorList, 2.50, d2, 5, "sd");
        
        //adding actors to MovieStock objects
        m1.addActor(a2);
        m1.addActor(a2);
        
        //creating GameStock objects
        GameStock g1 = new GameStock("Tomb Raider", "RPG", "PS4/XBOX", 18, 75, d2, 8, 2, 1);
        GameStock g2 = new GameStock("Call of Duty", "War", "PS4/XBOX", 18, 60, d2, 15, 1, 15);
        
        //creating an ArrayList of type Stock
        ArrayList<Stock> list1 = new ArrayList<Stock>();
        ArrayList<Stock> availableStock1 = new ArrayList<Stock>();
        
        //Check to see if stock is available
        if(m1.getQuantity() > 0){
            availableStock1.add(m1);
        }
        if(m2.getQuantity() > 0){
            availableStock1.add(m2);
        }
         if(g1.getQuantity() > 0){
            availableStock1.add(g1);
        }
        if(g2.getQuantity() > 0){
            availableStock1.add(g2);
        }
        if(playlist.getQuantity() > 0){
            availableStock1.add(playlist);
        }
        
        //creating an object of type Customers
        Customers c1 = new Customers("customer",availableStock1, list1);

        //Searches 
        c1.searchForStock(g1);
        
        //------------------------------------USER INPUT ONLINE SHOP---------------------------------------------//
        
        Scanner uName = new Scanner(System.in);
        Scanner u2 = new Scanner(System.in);
        Scanner u3 = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        c1.setName(uName.nextLine());
        
        System.out.println("\nHi " + c1.getName());
        System.out.print("\n"
                 + "Enter 1 to sort stock by name or 2 to sort stock by price: ");
        int int1 = Integer.parseInt(u2.nextLine());
        int i = 1;
        if(int1 == 1){
            do{
                System.out.println("");
                c1.sortByName();
                System.out.print("\nIf you want to purchase any of the stock press the corresponding number, "
                        + "\n\ti.e. 1 - 90's Playlist, 2 - Iron Man, 3 - The Holiday, 4 - Tomb Raider, 5 - Call of Duty, and 6 for QUIT: ");
                int int2 = Integer.parseInt(u3.nextLine());
                switch(int2){
                    case 1:
                        c1.addPurchase(playlist);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory());
                        break;
                    case 2:
                        c1.addPurchase(m1);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory());
                        break;
                    case 3:
                        c1.addPurchase(m2);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory());
                        break;
                    case 4:
                        c1.addPurchase(g1);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory());
                        break;
                    case 5:
                        c1.addPurchase(g2);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory());
                        break;
                    default:
                        System.out.print("Would you like to quit? Please hit 0 for quit: ");
                        Scanner u4 = new Scanner(System.in);
                        if(Integer.parseInt(u4.nextLine()) == 0){
                            i = 0;
                        }
                        break;
                }
            }while(i == 1);
        }else if(int1 == 2){
             do{
                System.out.println("");
                c1.sortByPrice();
                System.out.println("\nIf you want to purchase any of the stock press the corresponding number, "
                        + "\n\ti.e. 1 - 90's Playlist, 2 - Iron Man, 3 - The Holiday, 4 - Tomb Raider, 5 - Call of Duty, and 6 for QUIT: ");
                int int2 = Integer.parseInt(u3.nextLine());
                switch(int2){
                    case 1:
                        c1.addPurchase(playlist);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory() +"\n\n");
                        break;
                    case 2:
                        c1.addPurchase(m1);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory() +"\n\n");
                        break;
                    case 3:
                        c1.addPurchase(m2);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory() +"\n\n");
                        break;
                    case 4:
                        c1.addPurchase(g1);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory() +"\n\n");
                        break;
                    case 5:
                        c1.addPurchase(g2);
                        System.out.println("\nYou have successfully purchased: " + c1.getPurchaseHistory() +"\n\n");
                        break;
                    default:
                        System.out.print("\nWould you like to quit? Please hit 0 for quit: ");
                        Scanner u4 = new Scanner(System.in);
                        if(Integer.parseInt(u4.nextLine()) == 0){
                            i = 0;
                        }
                        break;
                }
            }while(i == 1);
        }else{
            System.out.print("See you soon!");
        }
        
         //Displays everything That the customer has purchased (PolyMorphism)
        c1.displayDetailsOfPurchases();
        //Displays the total Download Size 
        c1.displayDownloadSize();
    }
}
