package com.deanalvero.kotlin.answers.leetcode.medium

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    private lateinit var testee: LongestSubstringWithoutRepeatingCharacters

    @Before
    fun setUp() {
        testee = LongestSubstringWithoutRepeatingCharacters()
    }

    @Test
    fun lengthOfLongestSubstring_inputExampleOne_returnCorrectOutput() {
        val expected = 3
        val actual = testee.lengthOfLongestSubstring(
            "abcabcbb"
        )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun lengthOfLongestSubstring_inputExampleTwo_returnCorrectOutput() {
        val expected = 1
        val actual = testee.lengthOfLongestSubstring(
            "bbbbb"
        )
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun lengthOfLongestSubstring_inputExampleThree_returnCorrectOutput() {
        val expected = 3
        val actual = testee.lengthOfLongestSubstring(
            "pwwkew"
        )
        Assert.assertEquals(expected, actual)
    }
}