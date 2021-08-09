/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseB.placeOf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rmans
 */
public class LogicExerciseBTest {
    
    public LogicExerciseBTest() {
    }

    @Test
    public void testPlaceEndingWith1() {
        int place = 41;
        String result = placeOf(place);
        assertEquals(result, "41st", "Place 41 should be 41st");
    }
    
    @Test
    public void testPlaceEndingWith2() {
        int place = 2;
        String result = placeOf(place);
        assertEquals(result, "2nd", "Place 2 should be 2nd");
    }
    
    @Test 
    public void testPlaceEndingWith3() {
        int place = 1023;
        String result = placeOf(place);
        assertEquals(result, "1023rd", "Place 1023 should be 1023rd");
    }
    
    @Test
    public void testMultipleof10() {
        int place = 10;
        String result = placeOf(place);
        assertEquals(result, "10th", "Multiple of 10 should end with th");
    }
    
    @Test
    public void testMultipleof100() {
        int place = 100;
        String result = placeOf(place);
        assertEquals(result, "100th", "Multiple of 100 should end with th");
    }
    
    @Test
    public void testRuleBreaker() {
        int place = 212;
        String result = placeOf(place);
        assertEquals(result, "212th", "Place 212 should be 212th.");
    }
}
