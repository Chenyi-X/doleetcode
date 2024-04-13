package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class Solution54Test {
    @Test
    public void test1 () {
        Solution54 test = new Solution54();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list =  test.spiralOrder(matrix);
        System.out.println(list);
        TestCase.assertEquals(list, List.of(1,2,3,6,9,8,7,4,5));

    }
}