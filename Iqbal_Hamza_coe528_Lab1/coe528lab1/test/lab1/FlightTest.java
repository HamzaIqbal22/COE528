/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hamza
 */
public class FlightTest {
    
    public FlightTest() {
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
     * Test of Flight constructor, of class Flight.
     */
    @Test
    public void testConstructor() {
        System.out.println("Testing Constructor,");
        Flight inst = new Flight (100, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals (100,inst.getFlightNumber());
        assertEquals("Toronto", inst.getOrigin());
        assertEquals("Kolkata", inst.getDestination());
        assertEquals("03/02/99 7:50 pm", inst.getDepartureTime());
        assertEquals(100, inst.getCapacity());
        assertEquals(1000, inst.getOriginalPrice(),0.001);
    }
    
    
    /**
     * Test of Flight constructor, using invalid values.
     */
    @Test
    public void testInvalidConstructor() {
        System.out.println("Testing Invalid Constructor,");
        boolean exception = false;
        try{
        Flight inst = new Flight (1000, "Kalkata", "Kalkata", "03/02/99 7:50 pm", 300, 1000);
        }
        catch (IllegalArgumentException exp){
        exception = true;
        }
        assertTrue (exception);
    }

  
    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 500);
        inst.setFlightNumber(1010);
        int expResult = 1010;
        assertEquals(expResult, inst.getFlightNumber());
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 200);
        int expResult = 1000;
        int result = inst.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        Flight inst = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 200);
        inst.setOrigin("Tokyo");
        String expResult = "Tokyo";
        assertEquals(expResult, inst.getOrigin());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight inst = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 300);
        String expResult = "Toronto";
        String result = inst.getOrigin();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        Flight inst = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        inst.setDestination("New York");
        String expResult = "New York";
        assertEquals(expResult, inst.getDestination());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight inst = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        String expResult = "Kolkata";
        String result = inst.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        Flight inst = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        inst.setDepartureTime("01/16/01 6:00 am");
        String expResult = "01/16/01 6:00 am";
        assertEquals(expResult, inst.getDepartureTime());
    }

    /**
     * Test of getDeptartureTime method, of class Flight.
     */
    @Test
    public void testGetDeptartureTime() {
        System.out.println("getDepartureTime");
        Flight inst = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        String expResult = "03/02/99 7:50 pm";
        String result = inst.getDepartureTime();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300,1000);
        inst.setCapacity(1020);
        int expResult = 1020;
        assertEquals(expResult, inst.getCapacity());
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 600, 1000);
        int expResult = 600;
        int result = inst.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumofSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumofSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 200, 500);
        inst.setNumofSeatsLeft(650);
        int expResult = 650;
        assertEquals(expResult, inst.getNumofSeatsLeft());
    }

    /**
     * Test of getNumofSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumofSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 1000);
        int expResult = 300;
        int result = inst.getNumofSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 1000);
        inst.setOriginalPrice(1500);
        double expResult = 1500;
        assertEquals(expResult, inst.getOriginalPrice(), 0.001);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 100);
        double expResult = 100;
        double result = inst.getOriginalPrice();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight inst = new Flight(1000, "Toronto", "Kolkata", "03/02/99 7:50 pm", 300, 1000);
        boolean expResult = true;
        boolean result = inst.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    
   
    @Test
    public void testToString() {
        
        Flight inst = new Flight(1030, "Toronto", "Kolkata" , "03/02/99 7:50 pm", 300, 1000.0);
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: $1000.0";
        String result = inst.toString();
        assertEquals(expResult, result);
       
    }
    
}
