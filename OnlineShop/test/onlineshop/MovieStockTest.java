/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c07597614
 */
public class MovieStockTest {
    
    public MovieStockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRunTimeMin method, of class MovieStock.
     */
    @Test
    public void testGetRunTimeMin() {
        System.out.println("getRunTimeMin");
        
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        
        MovieStock instance = m1;
        int expResult = 120;
        int result = instance.getRunTimeMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRunTimeMin method, of class MovieStock.
     */
    @Test
    public void testSetRunTimeMin() {
        System.out.println("setRunTimeMin");
        int runTimeMin = 110;
        
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        MovieStock instance = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        instance.setRunTimeMin(runTimeMin);
        
        int expResult = 110;
        int result = instance.getRunTimeMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addActor method, of class MovieStock.
     */
    @Test
    public void testAddActor() {
        System.out.println("addActor");
        
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        Actor a1 = new Actor("Robert", "Downey Jr");
        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        
        MovieStock instance = m1;
        instance.addActor(a1);
        
        boolean expResult = true;
        boolean result = instance.getActorList().contains(a1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeActor method, of class MovieStock.
     */
    @Test
    public void testRemoveActor() {
        System.out.println("removeActor");
        
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        Actor a1 = new Actor("Robert", "Downey Jr");
        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        
        
        MovieStock instance = m1;
        instance.addActor(a1);
        
        instance.removeActor(a1);
        
        boolean expResult = false;
        boolean result = instance.getActorList().contains(a1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showAllActors method, of class MovieStock.
     */
    @Test
    public void testShowAllActors() {
        System.out.println("showAllActors");
        
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        Actor a1 = new Actor("Robert", "Downey Jr");
        Actor a2 = new Actor("Emma", "Watson");
        MovieStock instance = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        
        instance.addActor(a2);
        instance.addActor(a1);
        
        String expResult = " Actor{fName='Emma', lName='Watson'} " +
            "Actor{fName='Robert', lName='Downey Jr'}" ;
        String result = instance.displayAllActorDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcDownloadSize method, of class MovieStock.
     */
    @Test
    public void testCalcDownloadSize() {
        System.out.println("calcDownloadSize");
        
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        Actor a1 = new Actor("Robert", "Downey Jr");
        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        
        double expResult = .8 * 6;
        double result = m1.calcDownloadSize();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MovieStock.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Date d1 = new Date(31, 10, 2016);
        HashSet<Actor> actorList = new HashSet<>();
        MovieStock m1 = new MovieStock("Iron Man", 120, "Science Fiction", actorList, 3.50, d1, 2, "hd");
        
        String expResult = "MovieStock{runTimeMin=120, genre='Science Fiction'}";
        String result = m1.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
