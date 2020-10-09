package com.deanalvero.java.answers.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopKFrequentWordsTest {
    private TopKFrequentWords testee;

    @Before
    public void setUp() {
        testee = new TopKFrequentWords();
    }

    @Test
    public void topKFrequent_inputExampleOne_returnCorrectOutput() {
        List<String> expected = Arrays.asList("i", "love");
        List<String> actual = testee.topKFrequent(
                new String[] {"i", "love", "leetcode", "i", "love", "coding"},
                2
        );
        assertEquals(expected, actual);
    }

    @Test
    public void topKFrequent_inputExampleTwo_returnCorrectOutput() {
        List<String> expected = Arrays.asList("the", "is", "sunny", "day");
        List<String> actual = testee.topKFrequent(
                new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},
                4
        );
        assertEquals(expected, actual);
    }

}
