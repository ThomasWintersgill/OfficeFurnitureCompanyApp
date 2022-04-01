/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.officefurniturecompany;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author thoma
 */
public class ChairTest {
    
    Chair instance;
    
    public ChairTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Chair("1111", WoodType.OAK, 1, true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isHasArmrests method, of class Chair.
     */
    @Test
    public void testIsHasArmrests() {
        System.out.println("isHasArmrests");
        boolean expResult = true;
        boolean result = instance.isHasArmrests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHasArmrests method, of class Chair.
     */
    @Test
    public void testSetHasArmrests() {
        System.out.println("setHasArmrests");
        boolean hasArmrests = false;
        Chair instance = new Chair();
        instance.setHasArmrests(hasArmrests);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Chair.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        String expResult = "[[]]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calculatePrice method, of class Chair.
     */
    @Test
    public void testCalculateprice() {
        System.out.println("calculateprice");
        int expResult = 7500;
        int result = instance.calculatePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
