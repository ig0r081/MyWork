/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author игорь
 */
public class StringUtilsIT {
    
    public StringUtilsIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of reverse method, of class StringUtils.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        String s = "";
        StringUtils instance = new StringUtils();
        String expResult = "";
        String result = instance.reverse(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class StringUtils.
     */
    @Test
    public void testName() {
        System.out.println("name");
        StringUtils instance = new StringUtils();
        instance.name();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
