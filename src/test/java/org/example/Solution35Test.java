package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution35Test {
    @Test
    public void test1 () {
        Solution35 solution35 = new Solution35();
        //测试返回值
        assertEquals(2,solution35.searchInsert(new int[]{1,3,5,6},5));
    }

    @Test
    public void test2 () {
        Solution35 solution35 = new Solution35();
        assertEquals(1,solution35.searchInsert(new int[]{1,3,5,6},2));
    }
}