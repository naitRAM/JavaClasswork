/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseB.multiplyAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rmans
 */
public class ArrayExerciseBTest {
    
   

    @Test
    public void testPositivesArrayAndPositiveMultiplier() {
        int[] arr = {1, 2, 3, 4, 5};
        int multiplier = 5;
        int[] result = multiplyAll(multiplier, arr);
        int[] expectedResult = {5, 10, 15, 20, 25};
        assertArrayEquals(expectedResult, result, "Positive values multiplied by positive multiplier must yield correct values");
    }
    
    @Test
    public void testEqualValuesMultipliedby0() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int multiplier = 0;
        int[] result = multiplyAll(multiplier, arr);
        int[] expectedResult = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expectedResult, result, "Array with all values equal and multiplier of 0 must yield correct values.");
    }
    
    @Test
    public void testMixedSignValuesAndNegativeMultiplier() {
        int[] arr = {-2, 0, 0, 1};
        int multiplier = -1;
        int[] result = multiplyAll(multiplier, arr);
        int[] expectedResult = {2, 0, 0, -1};
        assertArrayEquals(expectedResult, result, "Array with zero, positive, and negative values and negative multiplier must yield correct values");
    }
    
}
