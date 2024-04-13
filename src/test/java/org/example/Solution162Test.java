package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution162Test {
    @Test
    public void test1 () {
        Solution162 s = new Solution162();
        //[1,3]
        assertEquals(1, s.findPeakElement(new int[]{1,3}));
        assertEquals(1, s.findPeakElement(new int[]{1,2}));

    }

}