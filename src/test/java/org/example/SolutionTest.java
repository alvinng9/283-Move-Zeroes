package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void moveZeroesTest() {
        Solution solution = new Solution();
        int[] inputOne = new int[]{0,1,0,3,12};
        solution.moveZeroes(inputOne);
        assertArrayEquals(new int[]{1,3,12,0,0},inputOne);

    }

}