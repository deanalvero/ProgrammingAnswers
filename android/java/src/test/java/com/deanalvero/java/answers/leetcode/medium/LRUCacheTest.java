package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {
    private LRUCache testee;

    @Test
    public void operations_defaultInput_returnCorrectOutput() {
        testee = new LRUCache( 2);
        testee.put(1, 1);
        testee.put(2, 2);
        assertEquals(1, testee.get(1));
        testee.put(3, 3);
        assertEquals(-1, testee.get(2));
        testee.put(4, 4);
        assertEquals(-1, testee.get(1));
        assertEquals(3, testee.get(3));
        assertEquals(4, testee.get(4));
    }
}
