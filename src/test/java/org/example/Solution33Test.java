package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution33Test {
    @Test
    public void testSearch() {
        Solution33 solution = new Solution33();
        assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, solution.search(new int[]{}, 1));
        assertEquals(0, solution.search(new int[]{1}, 1));
        assertEquals(-1, solution.search(new int[]{1, 3, 5}, 2));
        assertEquals(1, solution.search(new int[]{1, 3, 5}, 3));
        assertEquals(2, solution.search(new int[]{1, 3, 5}, 5));
        assertEquals(1, solution.search(new int[]{3, 1}, 1));
        assertEquals(0, solution.search(new int[]{3,1}, 3));
        assertEquals(1, solution.search(new int[]{1,3}, 3));
        assertEquals(2, solution.search(new int[]{5,1,3}, 3));
        assertEquals(0, solution.search(new int[]{6,7,1,2,3,4,5}, 6));
        assertEquals(1, solution.search(new int[]{5,1,3}, 1));
        assertEquals(1, solution.search(new int[]{8,9,2,3,4}, 9));

    }
}