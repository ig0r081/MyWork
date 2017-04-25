/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toy.anagrams.lib;

/**
 *
 * @author игорь
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class StringUtils {

public  String reverse(String s) {
        if(s.length()== 0){
            throw new IllegalArgumentException("Переданое значение равно ноль");
        }
        List <String> tempArray = new ArrayList<String>(s.length());
            for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i + 1));
        }
            StringBuilder reversedString = new StringBuilder(s.length());
            for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
            return reversedString.toString();
	}
public void name (){
    HashMap a  = new HashMap();

}
}
