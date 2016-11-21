

/**
 * Created by CMB on 02/11/2016.
 */

import java.util.HashSet;

public class Tester {

    public static void main(String[] args){

        Date d1 = new Date(31, 10, 2016);
        Date d2 = new Date(01, 11, 2016);

        //d1.compareTo(d2);

        Actor a1 = new Actor("Emma", "Watson");
        Actor a2 = new Actor("Robert", "Downey Jr");
        Actor a3 = new Actor("Jude", "Law");


        HashSet<Actor> actorList = new HashSet<>();

        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1);

        MovieStock m2 = new MovieStock("Colonia", actorList, "War");

        m1.addActor(a2);
        m1.addActor(a2);
        m2.addActor(a3);

        System.out.println(" " + m1.toString());
        System.out.println(" " + m2.toString());

        GameStock g1 = new GameStock("Grand Theft Auto", "RPG", "PS4/XBOX", 18, 75, d2);

        System.out.println(" " + g1.toString());

    }
}
