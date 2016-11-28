/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C13555907
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

    public MovieStock(String name, int runTimeMin, String genre, HashSet<Actor> aList, double price, Date releaseDate, int quantity, String format){
        super(name, price, releaseDate, quantity, genre);
        this.actorList = aList;
        setRunTimeMin(runTimeMin);
        this.format = format;
    }
    
    public MovieStock(String name, HashSet<Actor> aList, String genre, String format){
        super(name);
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
        return "MovieStock{" + super.getName() +
                ", runTimeMin=" + runTimeMin +
                ", actorList=" + actorList +
                '}';
    }
}
