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

        MovieStock m2 = new MovieStock("Colonia", actorList, "War", "sd");
        
        //Adds actors to both objects
        m1.addActor(a1);
        m1.addActor(a2);
        m2.addActor(a2);
        
       System.out.println("The Actor Details Are:" + m1.displayAllActorDetails());
        //m1.showAllActors();
        //System.out.println(" " + m1.toString());
       // System.out.println(" " + m2.toString());

        GameStock g1 = new GameStock("Grand Theft Auto", "RPG", "PS4/XBOX", 18, 75, d2, 20, 1);

        //System.out.println(" " + g1.toString());
        
        ArrayList<Stock> list1 = new ArrayList<Stock>();
        Customers customer1 = new Customers("Hal Jordan", list1);
        
        customer1.addPurchase(g1);
        customer1.addPurchase(m1);
        //customer1.addPurchase(m2);
        
        customer1.displayAllDetails();
        customer1.sortByName();
        customer1.sortStockByPrice();
        
        
        System.out.printf("The ammount of memory used to download %s is : %.2f GB\n\n" ,m1.getName(), m1.calcDownloadSize());
        System.out.printf("The ammount of memory used to download %s is : %.2f GB\n\n",m2.getName() ,m2.calcDownloadSize());
        System.out.printf("The ammount of memory used to download %s is : %.2f GB\n\n",g1.getName() ,g1.calcDownloadSize());
        System.out.printf("The ammount of memory used to download %s is : %.2f MB\n\n",playlist.getName() ,playlist.calcDownloadSize());

        
        customer1.searchForStock(m2);
    }
}
