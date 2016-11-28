package onlineshop;


/**
 * Created by CMB on 01/11/2016.
 */

import java.util.HashSet;

public class MovieStock extends Stock{

    private int runTimeMin;
    private String genre;
    private HashSet<Actor> actorList;
    private static int nofActors;
    private double fileSize = .8;
    private final static int hd = 6;
    private final static int sd = 1;
    private String format;

    public MovieStock(String name, int runTimeMin, String genre, HashSet<Actor> aList, double price, Date releaseDate, String format){
        super(name, price, releaseDate);
        this.actorList = aList;
        setRunTimeMin(runTimeMin);
        setGenre(genre);
        this.format = format;
    }

    public MovieStock(String name, HashSet<Actor> aList, String genre, Date releaseDate, String format){
        super(name, releaseDate);
        this.actorList = aList;
        setGenre(genre);
        this.format = format;
    }

    public int getRunTimeMin() {
        return runTimeMin;
    }

    public void setRunTimeMin(int runTimeMin) {
        this.runTimeMin = runTimeMin;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public HashSet<Actor> getActorList() {
        return actorList;
    }

    public void addActor(Actor a){
        actorList.add(a);
        nofActors++;
    }

    public void removeActor(Actor a){
        if(actorList.contains(a)){
            actorList.remove(a);
            nofActors--;
        }else{
            System.out.println("Actor unknown");
        }
    }

    public void showAllActors(){
        if(actorList.isEmpty()){
            System.out.println("There are no actors saved in the database");
        }else{
            for(Actor a: actorList) {
                
                System.out.println(a);
            }
        }
    }
    
    public String displayAllActorDetails(){
        
        String result = "";
        
        if(actorList.isEmpty()){
            System.out.println("There are no actors saved in the database");
        }else{
            for(Actor a: actorList) {
                 result = result + a.toString();                
            }
        }
        return result;
    }
    
    @Override
    public double calcDownloadSize()
    {
        double totalMemoryUsed; //create local variable
        if(format == "hd")
        {
            totalMemoryUsed = fileSize * 6;
            return totalMemoryUsed;
        }
        else if(format == "sd")
        {
            totalMemoryUsed = fileSize * 1;
            return totalMemoryUsed;
        }
        else
        {
            System.out.println("In valid File Type");
            return 0;
        }
                
    }

    @Override
    public String toString() {
        return "MovieStock{" +
                "runTimeMin=" + runTimeMin +
                ", genre='" + genre + '\'' +
                //", actorList=" + actorList +
                '}';
    }
}
