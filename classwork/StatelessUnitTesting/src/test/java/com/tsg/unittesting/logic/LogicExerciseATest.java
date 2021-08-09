/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rmans
 */
public class LogicExerciseATest {
    
    @Test
    public void testStranger() {
        String name = "Goofus";
        Boolean isFriend = false;
        String result = friendlyGreeting(name, isFriend);
        assertEquals(result, "hi", "Must return 'hi' if not a friend");
    }
    
    @Test
    public void testFriend() {
        String name = "Gallant";
        Boolean isFriend = true;
        String result = friendlyGreeting(name, isFriend);
        assertEquals(result, "Hello, Gallant!", "Must return 'Hello, (name)!' if (name) is a friend");
        
    }
    
    @Test
    public void testNameless() {
        String name = null;
        Boolean isFriend = false;
        String result = friendlyGreeting(name, isFriend);
        assertEquals(result, "...", "null name parameter must return '...'");
    }
    
    
}
