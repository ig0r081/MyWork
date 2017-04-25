/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class MoneyParameterizedTest {
    @Parameterized.Parameter(0)
    public int amount;
    @Parameterized.Parameter(1)
    public String currency;
    
    
    
    @Parameterized.Parameters
    public static Iterable < Object[]> bMoney() {
        return Arrays.asList(new Object[][] { { 0, "3" },{ 0, "3" } });
    }
    @Before
    public void setUp (){
    System.out.println("Привет");
        }
    
    @Test
    public void constructorShouldSetAmountAndCurrency(
            ) {
 Money money = new Money(amount, currency);
        
        assertEquals(0, money.getAmount());
        assertEquals("3", money.getCurrency());
    }
}
