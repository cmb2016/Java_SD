/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author c07597614
 */
public class DateTest {
    
    public DateTest() {
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

    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testExpectedExceptionForInvalidDay() {
        
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(containsString("Invalid day! "));
        
        System.out.println("setDay");
        int d = 0;
        Date instance = new Date(11,11,11);
        instance.setDay(d);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testExpectedExceptionForInvalidMonth() {
        
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(containsString("Invalid month! "));
        
        System.out.println("setMonth");
        int m = 0;
        Date instance = new Date();
        instance.setMonth(m);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Date.
     */
    @Test
    public void testExpectedExceptionForInvalidYear() {
        
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(containsString("Invalid year! "));
        
        System.out.println("setYear");
        int y = 0;
        Date instance = new Date();
        instance.setYear(y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date instance = new Date(12,10,16);
        int expResult = 12;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date instance = new Date(21,11,16);
        int expResult = 11;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date instance = new Date(21,11,2016);
        int expResult = 2016;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Date.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Date d1 = null;
        Date instance = new Date();
        int expResult = 0;
        int result = instance.compareTo(d1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Date.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Date instance = new Date(11,11,2016);
        String expResult = "11/11/2016";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
