
/**
 * Created by CMB on 01/11/2016.
 */

import java.util.HashSet;

public class MovieStock extends Stock{

    private int runTimeMin;
    private String genre;
    private HashSet<Actor> actorList;
    private static int nofActors;

    public MovieStock(String name, int runTimeMin, String genre, HashSet<Actor> aList, double price, Date releaseDate){
        super(name, price, releaseDate);
        this.actorList = aList;
        setRunTimeMin(runTimeMin);
        setGenre(genre);
    }

    public MovieStock(String name, HashSet<Actor> aList, String genre){
        super(name);
        this.actorList = aList;
        setGenre(genre);
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
    public String toString() {
        return "MovieStock{" +
                "runTimeMin=" + runTimeMin +
                ", genre='" + genre + '\'' +
                ", actorList=" + actorList +
                '}';
    }
}
