package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class Solution74Test {
    @Test
    public void test() {
        //[[1]]
        //1
        Solution74 test1 = new Solution74();

        assertFalse(test1.searchMatrix(new int[][]{{1}}, 0));
    }
}