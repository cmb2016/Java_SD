package onlineshop;



/**
 * Created by CMB on 02/11/2016.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class Tester {

    public static void main(String[] args){

        //Date Constructors
        Date d1 = new Date(31, 10, 2016);
        Date d2 = new Date(01, 11, 2016);
        Date d3 = new Date(11, 03, 2017);
        
        //d1.compareTo(d2);
        
        //Actor Constructors
        Actor a1 = new Actor("Emma", "Watson");
        Actor a2 = new Actor("Robert", "Downey Jr");
        Actor a3 = new Actor("Jude", "Law");
        
        //Song Constructors
        Songs song1 = new Songs("Torn",3.14,"Rock");
        Songs song2 = new Songs("Umbop",2.98,"Pop");
        Songs song3 = new Songs("Stan",3.33,"Rap");
        
        //Creates an array list For Song Objects
        ArrayList<Songs> list3 = new ArrayList<Songs>();
        
        //Constuctor for MusicStock
        MusicStock playlist = new MusicStock("Songs Playlist", 4, d1, list3);
        
        //Adds Songs into the Arraylist stored in movie stock
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        //Creates a Hashset of actors, can not contain duplicate entries
        HashSet<Actor> actorList = new HashSet<>();

        //Creates two different movie stock objects using overloaded constructors
        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, "hd");

        MovieStock m2 = new MovieStock("Colonia", actorList, "War", d3, "sd");
        
        //Adds actors to both objects
        m1.addActor(a1);
        m1.addActor(a2);
        //m2.addActor(a2);
        
       //System.out.println("The Actor Details Are:" + m1.displayAllActorDetails());
        //m1.showAllActors();
        //System.out.println(" " + m1.toString());
       // System.out.println(" " + m2.toString());

        GameStock g1 = new GameStock("Grand Theft Auto", "RPG", "PS4/XBOX", 18, 75, d2, 20, 1);

        //System.out.println(" " + g1.toString());
        
        //Create an array list of stock objects and create a customer object
        
        ArrayList<Stock> AvailableStock1 = new ArrayList<Stock>();
        AvailableStock1.add(m1);
        AvailableStock1.add(m2);
        AvailableStock1.add(g1);
        AvailableStock1.add(playlist);
        
        ArrayList<Stock> list1 = new ArrayList<Stock>();
        Customers customer1 = new Customers("Hal Jordan", AvailableStock1, list1);
        
        //Add items of Stock That the customer is buying to the customer
        customer1.addPurchase(g1);
        customer1.addPurchase(m1);
        customer1.addPurchase(m2);
        customer1.addPurchase(playlist);
        
        //Displays everything That the customer has purchased
        customer1.displayDetailsOfPurchases();
        
        //Sorts What the customer has Purchased
        customer1.sortByName();
        customer1.sortStockByPrice();
        customer1.sortAppsByReleaseDate();
        
        //Prints out the calc download size for each item Purchased 
        System.out.printf("The ammount of memory used to download %s is : %.2f GB\n\n"
                    ,m1.getName(), m1.calcDownloadSize());
        System.out.printf("The ammount of memory used to download %s is : %.2f GB\n\n"
                    ,m2.getName() ,m2.calcDownloadSize());
        System.out.printf("The ammount of memory used to download %s is : %.2f GB\n\n"
                    ,g1.getName() ,g1.calcDownloadSize());
        System.out.printf("The ammount of memory used to download %s is : %.2f MB\n\n"
                    ,playlist.getName() ,playlist.calcDownloadSize());

        //Prints out the download size for each item purchased 
        customer1.displayDownloadSize();
        customer1.searchForStock(m2);
        
        //System.out.println(m1.calcDownloadSize());

    }
}
