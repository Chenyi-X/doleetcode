package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution58Test {
    @Test
    public void test1() {
        Solution58 test = new Solution58();
        int res = test.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4,res);
        res = test.lengthOfLastWord("a ");
        assertEquals(1,res);
    }

}