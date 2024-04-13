package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class Solution34Test {
    @Test
    //测试，调用函数
    public void test() {
        Solution34 solution34 = new Solution34();

        TestCase.assertEquals(Arrays.toString(new int[]{3, 4}), Arrays.toString(solution34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    @Test
    //写test2 [2,2] target = 3
    public void test2() {
        Solution34 solution34 = new Solution34();
        TestCase.assertEquals(Arrays.toString(new int[]{-1,-1}), Arrays.toString(solution34.searchRange(new int[]{2,2}, 3)));
    }




}