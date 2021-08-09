/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rmans
 */
public class ArrayExerciseATest {
    
   @Test
   public void testOneItemArray () {
    int[] arr = {9};
    int result = maxOfArray(arr);
    assertEquals(result, 9, "Array of length 1 should return the only value.");
}
   @Test
   public void testAllPositivesArray () {
       int[] arr = {8, 15, 24, 96, 47, 32, 192, 87};
       int result = maxOfArray(arr);
       assertEquals(result, 192, "Greatest number in array of positive integers must be returned.");
   }
   
   @Test
   public void testAllNegativesArray () {
       int[] arr = {-19, -24, -342, -86, -120, -99};
       int result = maxOfArray(arr);
       assertEquals(result, -19, "Greatest number in array of negative integers must be returned.");
   }
    
   @Test
   public void testMixedSignArray () {
       int [] arr = {134, -23, -47, 0, 965, 42, -17, -202};
       int result = maxOfArray(arr);
       assertEquals(result, 965, "Greatest number in an array of mixed-sign integers must be returned.");
   }
}
