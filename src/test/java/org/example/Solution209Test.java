package org.example;


import org.junit.Assert;
import org.junit.Test;

public class Solution209Test  {
    @Test
    public void test1() {
        Solution209 test = new Solution209();
        Assert.assertEquals(3,test.minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
    @Test
    public void test2() {
        Solution209 test = new Solution209();
        Assert.assertEquals(2,test.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void test3() {
        Solution209 test = new Solution209();
        Assert.assertEquals(0,test.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
    }

    //写测试，6，[10,2,3]
    @Test
    public void test4() {
        Solution209 test = new Solution209();
        Assert.assertEquals(1,test.minSubArrayLen(6,new int[]{10,2,3}));
    }

}