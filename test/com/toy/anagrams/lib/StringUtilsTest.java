/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author игорь
 */
@RunWith(Parameterized.class)
public class StringUtilsTest {
    String s;
    String expResult;
    public StringUtilsTest(String s, String expResult ){
       this.s = s;
       this.expResult =expResult;
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { "Привет", "тевирп" },
         { "Привет", "тевирП" },
         { "ПРИВЕТ", "ТЕВИРП" },
         { "", "" },
      });
   }
  
    @Test(expected = IllegalArgumentException.class )
    public void testReverse() {
        StringUtils instance = new StringUtils();
        String result = instance.reverse(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    
}
}
